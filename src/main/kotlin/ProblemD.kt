class ProblemD {

    fun main() {
        val t: Int = readInt()
        for (i in 0 until t) {
            val n: Int = readInt()
            val coins: LongArray = readLongArray(n)
            var profit = 0L
            coins.sort()
            for (j in coins.indices) {
                val currentProfit = (coins[j] * (coins.size - j))
                if (currentProfit > profit) {
                    profit = currentProfit
                }
            }
            println(profit)
        }
    }
}