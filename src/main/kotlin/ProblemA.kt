class ProblemA {

    fun main() {
        var requests: Int = readInt()
        while (requests-- > 0) {
            val params: List<Long> = readListLong()
            val rightJumpLength: Long = params[0]
            val leftJumpLength: Long = params[1]
            val jumps: Long = params[2]

            val finishPoint = rightJumpLength * (jumps / 2 + jumps % 2) - leftJumpLength * (jumps / 2)
            println(finishPoint)
        }
    }

}