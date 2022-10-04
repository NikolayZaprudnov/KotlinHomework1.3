fun main() {
    val amount = 5000.0
    val card = "Vk pay"
    val moneyInMounth = 0.0
    val comission = calculateComission(amount , card , moneyInMounth)
    val sum = amount - comission
    println("Комиссия составляет $comission")
    println("Итоговая сумма $sum")

}

fun calculateComission(amount: Double, card: String, moneyInMounth: Double): Double {
    return when (card) {
        "MasterCard", "Maestro" -> if (moneyInMounth > 75000) {
             (amount / 100) * 0.6
        } else {
             0.0
        }
        "Visa", "Мир" -> if ((amount / 100) * 0.75 < 35) {
             35.0
        } else {
             (amount / 100) * 0.75
        }
        else -> {0.0}
    }
}

