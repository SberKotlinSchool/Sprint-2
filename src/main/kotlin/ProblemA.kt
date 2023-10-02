class ProblemA {

    fun main() {
        val frogCount = readLong()
        for (i in 1 .. frogCount) {
            val (rightJump, leftJump, spaceCount) = readLongArray(3)
            println((spaceCount - spaceCount/2) * rightJump - spaceCount/2 * leftJump)
        }
    }

}