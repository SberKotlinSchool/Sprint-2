class ProblemD {

    fun main() {
        val requestCount = readInt()
        for (r in 1..requestCount) {
            readInt() // skip
            println(getMaxProfitSum(readListLong().sorted()))
        }
    }

    private fun getMaxProfitSum(clientPrices: List<Long>): Long {
        var maxProfitSum = 0L
        for (i in clientPrices.lastIndex downTo 0) {
            val profitSum = clientPrices[i] * (clientPrices.size - i)
            if (profitSum < maxProfitSum) {
                break
            }
            maxProfitSum = profitSum
        }
        return maxProfitSum
    }
}
