fun main() {
    println("Bem vindo ao Bytebank, curso 01 do @Alura")

    val artur = Funcionario(
        nome = "Artur",
        cpf = "111.111.111-11",
        salario = 3500.00
    )

    println(artur.nome)
    println(artur.cpf)
    println(artur.salario)
    println("Bonificacao ${artur.bonificacao()}")
}





