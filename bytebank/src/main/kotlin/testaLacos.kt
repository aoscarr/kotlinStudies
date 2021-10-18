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
