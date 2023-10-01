class ProblemB {

    fun main() {
        val queryCount = readInt()
        for (i in 1..queryCount) {
            val (lengthLine, charCount) = readIntArray(2)
            val result = CharArray(lengthLine) { 'a' + (it % charCount) }
            println(result)
        }
    }

}