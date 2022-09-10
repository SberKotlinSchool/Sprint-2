private const val ASCII_A = 97

class ProblemB {

    fun main() {
        val t = readInt()
        for (j in 1..t) {
            val (n, k) = readListInt()
            StringBuilder().run {
                for (i in 0 until n) {
                    append((ASCII_A + i % k).toChar())
                }
                println(this)
            }
        }
    }
}