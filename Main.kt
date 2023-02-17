fun main() {

    val titular: String = "Daniel"
    val numConta: Int = 1000
    var saldo = 10.0

    for (i in 10 downTo 1) {
        saldo -= i
    }

    println("titular $titular")
    println("numero da conta $numConta")
    println("Saldo da conta $saldo")
    println()
    testaCondicoes(saldo)
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é Positiva, SALDO: $saldo")
        saldo == 0.0 -> println("Conta Zerada, SALDO: $saldo")
        else -> println("Conta Negativa, SALDO: $saldo")
    }
}


