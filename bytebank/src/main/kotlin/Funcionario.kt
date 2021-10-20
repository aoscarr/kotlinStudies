open class Funcionario( // o 'open' eh para permitir que Funcionario seja herdada.
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    open val bonificacao: Double
        get() = salario * 0.1

}
// O open eh necessario pois o kotlin parte da premissa que tudo eh imutavel.