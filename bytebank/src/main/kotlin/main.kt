fun main() {
    println("Bem vindo ao Bytebank, curso 01 do @Alura")

    val artur = Diretor(
        nome = "Artur",
        cpf = "111.111.111-11",
        salario = 3500.00,
        plr = 500.0,
        senha = 1234

    )
    val oscar = Gerente(
        nome = "Artur",
        cpf = "111.111.111-11",
        salario = 3500.00,
        senha = 1234
    )
    val junior = Funcionario(
        nome = "Artur",
        cpf = "111.111.111-11",
        salario = 3500.00

    )

    println(artur.nome)
    println(artur.cpf)
    println(artur.salario)
    println("Bonificacao ${artur.bonificacao}")
    println("Bonificacao ${oscar.bonificacao}")
    println("Bonificacao ${junior.bonificacao}")



}





