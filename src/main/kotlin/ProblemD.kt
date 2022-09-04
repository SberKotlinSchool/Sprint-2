class ProblemD {

    fun main() {

        //ваша реализация в методе main
        val dataSet = readInt()
        for (i in 1..dataSet) {
            val namberOfClients = readInt()
            val coin = readLongArray(namberOfClients)
            println(earningCafe(coin))
        }

    }

    private fun earningCafe(coin: LongArray): Long {

        var max = 0L

        for (i in coin.indices) {
            var count = 0L
            for (j in coin.indices) {
                if (coin.get(j) >= coin.get(i))
                    count = count + coin.get(i)
            }
            if (count > max)
                max = count

        }
        return max

    }

}