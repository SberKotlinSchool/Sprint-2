
class ProblemA {

    fun main() {
        //ваша реализация в методе main
        val iterations = readInt()

        for (i in 1..iterations) {
            val jumpInfo = readListInt()
            var position: Long = 0
            val k = jumpInfo[2]
            val a = jumpInfo[0].toLong()
            val b = jumpInfo[1].toLong()

            if (k % 2 == 0) {
                position += (a - b) * (k / 2)
            } else {
                position += (a - b) * (k / 2) + a
            }
            println(position)
        }
    }
}
