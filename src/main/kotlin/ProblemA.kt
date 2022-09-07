class ProblemA {

    fun main() {
        //ваша реализация в методе main
        val lines = readInt()
        for (i in 1..lines) {
            val data = readListInt()
            val a = data[0].toLong()
            val b = data[1].toLong()
            val k = data[2]
            val result = ((a - b) * (k / 2)) + (if (k % 2 == 0) 0 else a)
            println(result)
        }
    }

}