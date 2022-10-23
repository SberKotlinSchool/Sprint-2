class ProblemB {

    fun main() {
        val stringNum = readInt()
        for (i in 0 until stringNum) {
            val (length, charNum) = readIntArray(2)
            val firstCharAsciiCode = 97 // a
            val resultSB = StringBuilder(length)
            for (inx in 0 until length) {
                resultSB.append(Char(firstCharAsciiCode + (inx % charNum)))
            }
            println(resultSB.toString())
        }
    }
}