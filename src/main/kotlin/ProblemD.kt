import kotlin.math.max

class ProblemD {

    fun main() {
        problemD()

    }
    fun problemD() {
//    Введите количество циклов
        val numberOfRequests = readLine()!!.toInt()

        repeat(numberOfRequests) {
            var marginMax: Long = 0
//    Введите количество клиентов
            val numberOfClients = readLine()!!.toInt()
//    Введите количество монет для каждого клиента через пробел
            val listNumberOfCoins = readLine()!!.trim().split(" ").run { LongArray(numberOfClients) { get(it).toLong() } }
            listNumberOfCoins.sortDescending()
//    Вычисляем максимальную прибыль кафе
            for ((index, value) in listNumberOfCoins.withIndex()) {
                var margin: Long = value * (index + 1)
                marginMax = max(margin, marginMax)
            }
            println(marginMax)
        }
    }

}