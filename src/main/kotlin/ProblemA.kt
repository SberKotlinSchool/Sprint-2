class ProblemA {

    fun main() {
        val countOfFrogs = readInt()
        for (i in 1..countOfFrogs) {
            val jumpParameters = readLongArray(3)
            println(
                resolvePosition(jumpParameters[0], jumpParameters[1], jumpParameters[2])
            )
        }
    }

    private fun resolvePosition(rightJump: Long, leftJump: Long, numberOfJumps: Long): Long {
        var position = 0L
        for (i in 1..numberOfJumps) {
            if (i.mod(2) == 0) {
                position -= leftJump
            } else {
                position += rightJump
            }
        }

        return position
    }

}