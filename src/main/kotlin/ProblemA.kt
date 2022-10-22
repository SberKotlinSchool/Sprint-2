class ProblemA {

    fun main() {
        val requestCount = readLong()
        for (s in 1..requestCount) {
            val args = readListLong().toLongArray()
            if (args.size == 3) {
                println(startJumping(*args))
            }
        }
    }

    private fun startJumping(vararg params: Long): Long {
        val (right, left, jumpCount) = params
        var jump = 0L
        var frogPos = 0L
        if (left == right) {
            return if (jumpCount % 2L == 0L) 0 else right
        }
        while (jump < jumpCount) {
            if (jump % 2L == 0L) {
                frogPos += right
            } else {
                frogPos -= left
            }
            jump++
        }
        return frogPos
    }
}