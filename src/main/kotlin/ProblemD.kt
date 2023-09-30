import java.io.File
import java.io.InputStream

/**
 * В примере №4 данной задачи указан результат  - прибыль 20 монет = 5 гамбургеров по 4 монеты.
 * Там скорее правильнее всё-таки 4 гамбургера по 5 монет. Прибыль также равна 20 монетам.
 */
class ProblemD {

    val filename = "src/main/resources/problemD/input.txt"
    val delimiter = " "

    fun main() {
        val inputStream: InputStream = File(filename).inputStream()
        val lines = mutableListOf<String>()
        inputStream.bufferedReader().forEachLine { lines.add(it) }

        val taskCount = lines[0].toInt()

        for (i in 1..taskCount * 2 step 2) {
            var clientsCount = lines[i].toInt()
            var clientCoinsArray = lines[i + 1].split(delimiter).sorted()

            println(getMaxProfit(clientsCount, clientCoinsArray))
        }
    }

    /**
     * Вычислим максимальную прибыль. Важно как можно больше монет получить.
     * Один клиент - может купить один гамбургер.
     *
     * clientsCount - количество клиентов
     * clientCoinsArray - массив монет
     *
     * Integer -Возвращаем максимальную прибыль
     */
    private fun getMaxProfit(clientsCount: Int, clientCoinsArray: List<String>): Long {
        var maxProfit: Long = 0

        for (i in clientsCount - 1 downTo 0) {
            var currentProfit: Long = 0
            var maxPrice = clientCoinsArray[i].toLong()

            for (j in clientsCount - 1 downTo 0) {
                val currentCoinsCount = clientCoinsArray[j].toLong()
                if (currentCoinsCount >= maxPrice)
                    currentProfit += maxPrice
                else
                    break;
            }

            if (maxProfit < currentProfit)
                maxProfit = currentProfit;
        }

        return maxProfit;
    }

}