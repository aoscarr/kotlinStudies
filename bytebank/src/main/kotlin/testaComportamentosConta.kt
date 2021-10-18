fun testaComportamentosConta() {
    /*Aula 01 - Variaveis*/


    // da para por labels nos parametros, assim pode enviar na sua ordem.
    val contaArtur = Conta(titular = "Artur", numero = 1000); // labels
    contaArtur.titular = "Artur"
    contaArtur.depositar(500.00)
    println("titular da conta: ${contaArtur.titular}")
    contaArtur.depositar(1200.0)
    println("saldo da conta: ${contaArtur.saldo}")

    val contaDois = Conta(numero = 1001, titular = "Teste")
}