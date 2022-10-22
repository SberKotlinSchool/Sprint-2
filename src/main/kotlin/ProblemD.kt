class ProblemD {

    fun main() {
        val requestCount = readInt()
        for (r in 1..requestCount) {
            val totalClients = readLong()
            val money = readListLong().distinct().sorted().reversed().toLongArray()
            println(getProfitSum(money, totalClients))
        }
    }

    private fun getProfitSum(money: LongArray, totalClients: Long): Long {
        if (money.size == 1) {
            return totalClients * money[0]
        }

        var profitPrice = 0L
        var profitClientCount = 1
        for (minPrice in money) {
            val nextSum = minPrice * profitClientCount
            val prevSum = profitPrice * (profitClientCount - 1)
            if (nextSum >= prevSum) {
                profitPrice = minPrice
                profitClientCount++
            }
            if (nextSum < prevSum) {
                profitClientCount--
                break
            }
        }
        return profitPrice * profitClientCount
    }
}