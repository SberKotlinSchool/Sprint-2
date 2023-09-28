class ProblemD {
    fun main() {
        val amount = readInt()

        for (i in 0 until amount) {
            val clients = readInt()
            val prices = readLongArray(clients)

            prices.sortDescending()

            var maxProfit = 0L
            for (j in prices.indices) {
                val profit = prices[j] * (j + 1)
                if (profit > maxProfit) {
                    maxProfit = profit
                }
            }
            println(maxProfit)
        }

    }
}