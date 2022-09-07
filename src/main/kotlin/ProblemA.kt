class ProblemA {

    fun main() {
        //ваша реализация в методе main
        val lines = readInt()
        for (i in 1..lines) {
            val data = readListLong()
            val a = data[0]
            val b = data[1]
            val k = data[2]
            val result = ((a - b) * (k / 2)) + ((k % 2) * a)
            println(result)
        }
    }

}