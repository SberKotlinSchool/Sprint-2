import kotlin.jvm.Throws

class ProblemD {

    fun main() {

        for (rqStep in 1..readInt()) {
            val (clientCount, coins) = loadInitialData()
            val sortedCoins = coins.sorted()
            var maxProfit = sortedCoins.get(0) * clientCount
            for (index in 1 until clientCount) {
                val profit = sortedCoins.get(index) * (clientCount - index)
                if (maxProfit < profit) maxProfit = profit
            }
            println(maxProfit)
        }
    }

    @Throws(IllegalArgumentException::class)
    fun loadInitialData(): InitialData {
        val clientCount: Int = readInt()
        val coins: List<Long> = readListLong()
        if (clientCount <= 0 || coins.size != clientCount || coins.any { it < 0 })
            throw IllegalArgumentException("Initial data error!")
        return InitialData(clientCount, coins)
    }

    data class InitialData(val clientCount: Int = 0, val coins: List<Long> = emptyList())
}
