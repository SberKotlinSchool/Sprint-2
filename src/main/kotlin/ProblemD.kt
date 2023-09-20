class ProblemD {

    fun main() {
        val t = readInt()
        repeat(t) {
            readInt()
            val coins = readListLong().sortedDescending()
            val maxProfit = coins.mapIndexed { index, coin ->
                coin * (index + 1)
            }.maxOrNull() ?: 0
            println(maxProfit)
        }
    }

}