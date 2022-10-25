class ProblemD {

    fun main() {

        //ваша реализация в методе main
        val count = readInt()
        for (i in 1..count){
            val countClients = readInt()
            val sums = readLongArray(countClients)
            println(calculateProfit(sums).toString())
        }
    }

    private fun calculateProfit(sums: LongArray): Long {
        var maxProfit : Long = 0
        for (price in sums.distinct()) {
            var profit : Long = 0
            for (sum in sums){
                if (sum >= price)
                    profit += price
            }
            if (profit > maxProfit)
                maxProfit = profit
        }
        return maxProfit
    }
}