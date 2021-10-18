class Conta(
    var titular: String,
    val numero: Int = 0

) {
    var saldo = 1.0
        private set(valor) {
            if (valor > 0)
                field = valor;
        }


    fun depositar(valor: Double) {
        if (valor < 0) {
            println("Nao eh possivel depositar valor negativo.")
            return;
        }
        this.saldo += valor;
    }

    fun sacar(valor: Double) {
        if (this.saldo < valor) {
            println("NEGADO: Saldo insuficiente.")
            return;
        }
        this.saldo -= valor;
    }

    fun transferir(valor: Double, conta: Conta){
        if (this.saldo < valor) {
            println("NEGADO: Saldo insuficiente.")
            return
        }
        conta.depositar(valor);
        this.saldo -= valor;
    }
}