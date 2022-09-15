class ProblemA {

    fun main() {
        val requests = readInt()

        for (i in 0 until requests) {
            val data = readStrings().map { it.toLong() }

            println(
                calcPosition(
                    rightJump = data[0],
                    leftJump = data[1],
                    jumpsCount = data[2]
                )
            )
        }
    }

    fun calcPosition(rightJump: Long, leftJump: Long, jumpsCount: Long): Long {
        val diff = rightJump - leftJump

        return diff * (jumpsCount / 2) + if (jumpsCount % 2 == 0L) 0 else rightJump
    }
}
