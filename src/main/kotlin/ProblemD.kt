class ProblemD {

    fun main() {

        repeat(readInt()) {
            val clientsNum = readInt()
            val sortedClientMoneyList = readListLong().sorted()

            var maxProfit = 0L
            var minPrice = 0L

            for ((index, clientMoney) in sortedClientMoneyList.withIndex()) {
                if (clientMoney > minPrice) {
                    val newMaxProfit = (clientsNum - index) * clientMoney
                    if (newMaxProfit > maxProfit) {
                        maxProfit = newMaxProfit
                        minPrice = clientMoney
                    }
                }
            }

            println(maxProfit)
        }
    }
}
