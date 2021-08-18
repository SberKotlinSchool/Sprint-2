class ProblemD {

    fun main() {
        var dataSets: Int = readInt()
        while (dataSets-- > 0) {
            val clientsNumber: Int = readInt();
            val clientsMoney: List<Long> = readListLong().sorted()

            val averageMoney = clientsMoney.sum() / clientsNumber
            val burgerPrice = clientsMoney.find { it >= averageMoney }!!
            val outcome = clientsMoney.filter { it >= burgerPrice }.count() * burgerPrice
            println(outcome)
        }
    }
}