class ProblemA {

    fun main() {
        val frogNum = readInt()
        for (i in 0 until frogNum) {
            val (rightJumpLength, leftJumpLength, jumpNumber) = readLongArray(3)
            var frogCoordinates = 0L
            for (jump in 0 until jumpNumber) {
                if (jump % 2 == 0L) { frogCoordinates += rightJumpLength } else { frogCoordinates -= leftJumpLength }
            }
            println(frogCoordinates)
        }
    }

}