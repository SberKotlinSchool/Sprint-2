

class ProblemA {
    fun main() {
        problemA()

        }
    fun problemA() {
//  Введите количество циклов
        val numberOfRequests = readLine()!!.toInt()

        for (i in 1..numberOfRequests) {
//  Введите три числа через пробел
            val threeValue = readLine()!!.trim().split(" ").run { IntArray(3) { get(it).toInt() } }

            var theFrogsPosition: Long = 0

            val positiveJump = threeValue[0].toLong()
            val negativeJump = threeValue[1].toLong()
            val amountOfJumps = threeValue[2].toLong()
//  Вычисление конечной позиции лягушки
            theFrogsPosition += (amountOfJumps / 2 * (positiveJump - negativeJump) + ((amountOfJumps % 2) * positiveJump))
            println(theFrogsPosition)
        }
    }
    }


