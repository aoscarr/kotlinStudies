fun main() {
    /*Aula 01 - Variaveis*/
    println("Bem vindo ao Bytebank, curso 01 do @Alura")

    // da para por labels nos parametros, assim pode enviar na sua ordem.
    val contaArtur = Conta(titular = "Artur", numero = 1000); // labels
    contaArtur.titular = "Artur"
    contaArtur.depositar(500.00)
    println("titular da conta: ${contaArtur.titular}")
    contaArtur.depositar(1200.0)
    println("saldo da conta: ${contaArtur.saldo}")

    val contaDois = Conta(numero = 1001, titular = "Teste")
}

//sempre trabalha inicialmente com os valores em val. So muda se for necessario.

// pode declarar a var nos param
class Conta( // deixa em uma linha ou deixa assim, caso tenha muitos param.
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

fun testaLacos() {

    // var -> variavel que seu valor pode ser modificado
    // val -> nao permite modificar seu valor. Comecar geralmente com val, se precisar muda para var.
    for (i in 1..5) { // o range com '..' deve ser crescente. Caso deseje que decremente, use downto.
        val titular = "Artur Oscar $i"; // o kotlin converte implicitamente para o tipo.
        val numeroConta: Int = 1000 + i // para forcar o tipo
        var saldo = i + 10.0; // eh estaticamente tipado.

        println("titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta: $saldo")

        testaCondicoes(saldo);
        testaLacos()
        println()
    }
    // for decrescente.
    for (i in 5 downTo 1 step 2) { //para pular e parar, usa if com continue ou break.
        println(i)
    }
    println()
    var x = 0
    while (x < 5) {
        println(x)
        x++
    }
}

fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0)
        println("A conta eh positiva.")
    else if (saldo == 0.0)
        println("a conta esta zerada.")
    else
        println("A conta esta negativa.")

    //equivalem-se.

    when { // tipo um switch case do kotlin
        saldo > 0.0 -> println("A conta eh positiva.")
        saldo == 0.0 -> {
            print("A conta esta zerada.")
        }
        else -> println("A conta esta negativa.")
    }
}