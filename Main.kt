fun main() {
    println("Hello World!")
    val titular: String = "Daniel"
    val numConta: Int = 100
    var saldo = 0.0

    saldo = 100 + 2.0
    saldo += 200

    println("titular $titular")
    println("numero da conta $numConta")
    println("Saldo da conta $saldo")

    if (saldo >= 0.0) {
        println("Conta com saldo positivo ou igual a zero")
    } else {
        println("Conta NEGATIVA")
    }


    when {
        saldo > 0.0 -> println("conta é Positiva")
        saldo == 0.0 -> println("Conta Zerada")
        else -> println("Conta Negativa")
    }

    
    }
