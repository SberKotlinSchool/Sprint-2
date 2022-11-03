class ProblemD {

    fun main() {
        val requestCount = readInt()
        for (r in 1..requestCount) {
            readInt() // skip
            val money = readListLong()
            println(getProfitSum(money.sorted().toLongArray()))
        }
    }

    private fun getProfitSum(money: LongArray): Long {
        var maxProfitPrice = 0L
        for (i in money.lastIndex downTo 0) {
            val priceSum = money[i] * (money.size - i)
            if (priceSum < maxProfitPrice) {
                break
            }
            maxProfitPrice = priceSum
        }
        return maxProfitPrice
    }
}
