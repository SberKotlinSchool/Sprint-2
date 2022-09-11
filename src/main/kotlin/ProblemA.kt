class ProblemA {

    fun main() {
        val t = readInt()
        for (i in 1..t) {
            val (a, b, k) = readListLong()
            println((a - b) * (k / 2) + a * (k % 2))
        }
    }
}