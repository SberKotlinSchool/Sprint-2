class ProblemD {

    fun main() {
        //ваша реализация в методе main
        val countCollections = readInt()
        for (i in 1..countCollections) {
            val countClients = readInt()
            val clientAmounts: LongArray = readLongArray(countClients)
            println(calculateProfit(clientAmounts))
        }
    }

    private fun calculateProfit(clientAmounts: LongArray): Long {
        var maxProfit = 0L
        clientAmounts.sort()
        for (i in clientAmounts.indices) {
            val currentMaxProfit = clientAmounts[i] * (clientAmounts.size - i)
            if (currentMaxProfit > maxProfit) {
                maxProfit = currentMaxProfit
            }
        }
        return maxProfit
    }

}