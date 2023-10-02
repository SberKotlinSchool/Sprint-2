class ProblemD {

    fun main() {
        val imputSetCount = readInt()
        for (i in 1 .. imputSetCount){
            val clientCount = readInt()
            val coins = readLongArray(clientCount).sorted()
            var maxProfit: Long = 0
            for (j in 0 until clientCount){
                val profit = coins[j] * (clientCount - j)
                maxProfit = maxOf(maxProfit, profit)
            }
            println(maxProfit)
        }

        //ваша реализация в методе main

    }

}