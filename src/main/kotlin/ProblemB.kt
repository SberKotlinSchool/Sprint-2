class ProblemB {

    fun main() {
        val t = readInt()
        for (i in 0 until t) {
            val (n, k) = readListInt()
            val answer = buildString(n) {
                for (j in 0 until n) {
                    append('a' + j % k)
                }
            }
            println(answer)
        }
    }
}