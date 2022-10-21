class ProblemA {

    fun main() {
        val count = readLong()
        for (s in 1..count) {
            val args = readListLong().toLongArray()
            if (args.size == 3) {
                println("${startJumping(*args)}")
            }
        }
    }

    private fun startJumping(vararg params: Long): Long {
        var jump = 0L
        var res = 0L
        if (params[0] == params[1]) {
            return if (params[2] % 2L == 0L) 0 else params[0]
        }
        while (jump < params[2]) {
            if (jump % 2L == 0L) res += params[0] else res -= params[1]
            jump++
        }
        return res
    }
}