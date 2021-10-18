
//sempre trabalha inicialmente com os valores em val. So muda se for necessario.

// pode declarar a var nos param
class Conta2( // deixa em uma linha ou deixa assim, caso tenha muitos param.
    var titular: String, // para ser opcional, basta por os valores de inicializacao
    val numero: Int = 0 // torna opcional

) {
    //var titular = titular
    //var numeroConta = numero
    var saldo = 1.0 // property, as var ja podem ter seus gets e sets proprios
        private set(valor) { //nao precisa indicar o tipo
            if (valor > 0)
                field = valor; // field eh o valor interno da var
        }
        get
    // chamar o construtor aqui, eh chamado de construtor secundario, eh possivel usar o primario,
    // que eh na propria declaracao da classe.
//    constructor(titular: String, numero: Int){ // construtor secundario
//        this.titular = titular;
//        this.numeroConta = numero;
//    }

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

    fun transferir(valor: Double, conta: Conta): Unit { // por padrao, retorna Unit
        if (this.saldo < valor) {
            println("NEGADO: Saldo insuficiente.")
            return
        }
        conta.depositar(valor);
        this.saldo -= valor;
    }
//    nao eh interessante get e set no kotlin.
//    fun getSaldo(): Double{
//        return this.saldo;
//    }
//    fun setSaldo(valor: Double){
//        if(valor > 0)
//            this.saldo = valor;
//    }
}