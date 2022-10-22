class ProblemD {

    fun main() {
        val count = readInt()

        var maxRevenue: Long = 0
        for (bundle in 1..count) {
            val clientsAmount = readInt()
            val prices = readLongArray(clientsAmount)
            prices.sort()
            val amountOfPrices = prices.size
            for (i in 0 until amountOfPrices) {
                val summ: Long = prices[i] * (amountOfPrices - i)
                if (summ > maxRevenue) maxRevenue = summ
            }
            when (bundle) {
                count -> print(maxRevenue)
                else -> print("$maxRevenue" + "\n")
            }
        }
    }
}
