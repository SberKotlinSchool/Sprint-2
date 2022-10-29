class ProblemD {

    fun main() {
        val t = readInt()
        repeat(t)
        {
            val n = readInt()
            val clientsMoney = readLongArray(n)
            var maxProfit = 0L
            val uniqMoney = clientsMoney.distinct().sorted()
            for (price in uniqMoney) {
                val clientsCount = clientsMoney.filter { it >= price }.size
                val profit = clientsCount * price
                if (maxProfit < profit)
                    maxProfit = profit
            }
            println(maxProfit)
        }

    }
}