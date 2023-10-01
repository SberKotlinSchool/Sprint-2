class ProblemA {

    fun main() {
        val queryCount = readInt()
        for (i in 1..queryCount) {
            val (right, left, spaceCount) = readLongArray(3)
            val result = right * (spaceCount - spaceCount / 2) - left * (spaceCount / 2)
            println(result)
        }
    }

}