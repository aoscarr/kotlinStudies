class Gerente(
    val senha: Int, nome: String, cpf: String, salario: Double
) : Funcionario(nome = nome,cpf = cpf,salario = salario) { // : para herdar.
    fun autenticar(senha: Int) {
        if(senha == this.senha){
            println("Autenticado com sucesso.")
        }else
            println("Senha incorreta.")
    }

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario;
        }
}