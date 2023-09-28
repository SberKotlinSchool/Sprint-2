class ProblemB {
    fun main() {
        val input = readInput()
        input.forEach {
            val resultStringBuilder = StringBuilder()
            repeat(it[0]) {i ->
                resultStringBuilder.append(97.toChar() + i % it[1])
            }
            println(resultStringBuilder.toString())
        }
    }

    private fun readInput(): List<List<Int>> {
        val result: MutableList<List<Int>> = mutableListOf()
        repeat(readInt()) {
            result.add(readListInt())
        }
        return result
    }

}