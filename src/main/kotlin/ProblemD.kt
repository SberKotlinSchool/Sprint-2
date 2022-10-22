import java.io.InputStream

class ProblemD {

    fun main() {

        //ваша реализация в методе main
        val inputStream: InputStream = this::class.java.getResource("problemD/input.txt")?.openStream() ?: throw Exception("No input file")
        System.setIn(inputStream)

        val inputDataSets = readInt()

        for (i in 1..inputDataSets) {
            /*val clients =*/ readInt()
            val coins = readListLong() // входные данные избыточны, кол-во элементов в массиве с деньгами = кол-ву посетителей
            println(getMaxProfit(coins))
        }
    }

    private fun getMaxProfit(coins: List<Long>): Long {
        var result : Long = 0

        for (coin in coins) {
            val currProfit : Long = coins.filter{ it >= coin }.size * coin
            if (currProfit > result)
                result = currProfit
        }
        return result
    }

}