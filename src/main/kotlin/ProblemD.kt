import java.io.InputStream

class ProblemD {

    private fun getMaxProfit(coins: List<Long>, clientsAmount: Int): Long {
        var maxProfit = 0L

        //Пробегаем по возможным стоимостям
        coins.forEach { cost ->
            var profit = 0L
            //Пробегаем по клиентам
            for (client in 0 until clientsAmount) {
                //Считаем общую прибыль от клиентов, у которых хватило монет
                if (coins[client] >= cost) profit += cost
            }
            if (profit > maxProfit) maxProfit = profit
        }

        return maxProfit
    }

    fun main() {
        val inputStream: InputStream = this::class.java.getResource("problemD/input.txt").openStream()
        System.setIn(inputStream)

        val setAmount = readInt()
        for (i in 1..setAmount) {
            val clientsAmount = readInt()
            val coins = readListLong()

            val optimalCost = getMaxProfit(coins, clientsAmount)
            println(optimalCost)
        }
    }
}