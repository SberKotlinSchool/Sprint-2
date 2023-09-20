class ProblemA {
    fun main() {
        val t = readInt()
        val results = mutableListOf<Long>()
        repeat(t) {
            val (a, b, k) = readListLong()
            val result = frogJump(a, b, k)
            results.add(result)
        }
        results.forEach { println(it) }
    }
    fun frogJump(a: Long, b: Long, k: Long): Long {
        return if (k % 2 == 0L) {
            (k / 2) * (a - b)
        } else {
            ((k - 1) / 2) * (a - b) + a
        }
    }
}