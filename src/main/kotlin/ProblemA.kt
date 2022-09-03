class ProblemA {
    fun main() {
        for (requestIndex in 1..readByte()) {
            val inputArray = readLongArray(3)
            val countBothMoves: Long = inputArray[2] / 2
            val countAdditionalRightMoves: Long = inputArray[2] % 2
            val leftDistance: Long = inputArray[0] * (countBothMoves + countAdditionalRightMoves)
            val rightDistance: Long = inputArray[1] * countBothMoves
            println("${leftDistance - rightDistance}")
        }
    }
}