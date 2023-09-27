import java.util.*

class ProblemD {

    fun main() {
        val numOfCases = readInt()
        for (i in 1..numOfCases) {
            val numOfClients = readInt()
            val money: LongArray = readLongArray(numOfClients)
            var profit: Long = 0

            Arrays.sort(money)
            for (j in 0 until numOfClients) {
                val currentProfit = money[j] * (numOfClients - j)
                if (currentProfit > profit) {
                    profit = currentProfit
                }
            }
            println(profit)
        }
    }

}