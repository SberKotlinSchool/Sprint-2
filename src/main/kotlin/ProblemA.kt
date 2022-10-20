class ProblemA {

    fun main() {
        val strings = arrayOf<String>(
            "6",
            "5 2 3",
            "100 1 4",
            "1 10 5",
            "1000000000 1 6",
            "1 1 1000000000",
            "1 1 999999999",
        )
        for (s in strings) {
            val args = s.split(" ").map{ it.toLong() }.toLongArray()
            if (args.size == 3) {
                println("${startJumping(*args)}")
            }
        }
    }

    private fun startJumping(vararg params: Long): Long {
        var jump = 0L
        var res = 0L
        if (params[0] == params[1]) {
            return if (params[2] % 2L == 0L) 0 else 1
        }
        while (jump < params[2]) {
            if (jump % 2L == 0L) res += params[0] else res -= params[1]
            jump++
        }
        return res
    }
}