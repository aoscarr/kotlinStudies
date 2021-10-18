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