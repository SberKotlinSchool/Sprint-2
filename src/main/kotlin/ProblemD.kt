class ProblemD {

    fun main() {
        val countOfSets = readInt()
        for (i in 1..countOfSets) {
            val countOfClients = readInt()
            val coinsToSpend = readLongArray(countOfClients)
            println(
                resolveMaxIncome(coinsToSpend)
            )
        }
    }

    private fun resolveMaxIncome(coinsToSpend: LongArray): Long {
        var maxIncome = 0L
        for (i in coinsToSpend.indices) {
            var tempIncome = 0L
            for (j in coinsToSpend.indices) {
                if (coinsToSpend[j] >= coinsToSpend[i])
                    tempIncome += coinsToSpend[i]
            }
            if (tempIncome > maxIncome)
                maxIncome = tempIncome
        }

        return maxIncome
    }

}