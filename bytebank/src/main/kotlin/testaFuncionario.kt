fun testaFuncionario() {
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

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 3000.00
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(artur)
    calculadora.registra(oscar)
    calculadora.registra(junior)
    calculadora.registra(maria)

    println("Total Bonificacao: ${calculadora.total}")
}
