class ProblemA {

    fun main() {
        val requestCount = readInt()
        repeat(requestCount) {
            val args = readListLong().toLongArray()
            if (args.size == 3) {
                println(startJumping(*args))
            }
        }
    }

    private fun startJumping(vararg params: Long): Long {
        val (right, left, jumps) = params
        if (left == right) {
            return if (jumps % 2L == 0L) 0 else right
        }
        return LongArray(jumps.toInt()) {
            if (it % 2L == 0L) right else -left
        }.sum()
    }
}