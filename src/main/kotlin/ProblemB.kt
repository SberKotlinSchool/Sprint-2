class ProblemB {

    fun main() {
        val aCode = 'a'.code
        val t = readInt()
        for (j in 1..t) {
            val (n, k) = readListInt()
            StringBuilder().run {
                for (i in 0 until n) {
                    append((aCode + i % k).toChar())
                }
                println(this)
            }
        }
    }
}