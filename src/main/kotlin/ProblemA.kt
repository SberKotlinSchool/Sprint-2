class ProblemA {

    fun main() {
        val numOfFrogs = readInt()
        for (i in 1..numOfFrogs) {
            val jumps: LongArray = readLongArray(3)
            val pairsOfJumps: Long = (jumps[0] - jumps[1]) * jumps[2].div(2)

            if (jumps[2].mod(2) == 0) {
                println(pairsOfJumps)
            } else {
                println(pairsOfJumps + jumps[0])
            }
        }
    }

}