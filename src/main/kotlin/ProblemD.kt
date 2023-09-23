class ProblemD {

    fun main() {
        val countRequest = readInt()

        repeat(countRequest) {
            readInt()
            val coins = readListLong()
            var profit = 0L
            coins.forEach {
                val count = coins.filter { l -> l >= it }.size
                profit = if(profit < count * it) {
                    count * it
                } else profit
            }
            println(profit)
        }
    }

}