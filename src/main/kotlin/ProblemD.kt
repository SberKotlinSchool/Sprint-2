class ProblemD {

    fun main() {

        //ваша реализация в методе main
        val count = readInt()
        repeat(count) {
            val clientCount = readInt()
            val clients = readLongArray(clientCount).sorted().asReversed()

            println(getMaxProfit(clients))
        }
    }

    private fun getMaxProfit(clients: List<Long>): Long {
        var maxProfit = 0L
        for (maxPrice in clients) {
            val profit = clients.count { it >= maxPrice } * maxPrice
            if (maxProfit > profit) {
                break
            }
            maxProfit = profit
        }
        return maxProfit
    }

}