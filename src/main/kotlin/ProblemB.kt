import kotlin.math.min

class ProblemB {

    fun main() {

        //ваша реализация в методе main
        //output на тестовый input может быть различным!
        val iterations = readInt()
        for (iteration in 1..iterations) {
            val request = readListInt()
            val n = request.get(0)
            val k = request.get(1)

            var result: String = ""
            var j = 0 //на сколько увеличиваем char

            for (i in 1..n) {
                if (j > k - 1) {
                    j = 0
                }
                result += 'a' + j
                j++
            }

            println(result)
        }
    }

}
