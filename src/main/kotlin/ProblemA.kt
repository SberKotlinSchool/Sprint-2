class ProblemA {

    fun main() {
        val resultBuilder = StringBuilder()
        readInput().forEach {
            var result = (it[0] - it[1]) * (it[2] / 2L)
            if (it[2] % 2 == 1L) {
                result += it[0]
            }
            resultBuilder.append(result).append("\n")
        }
        println(resultBuilder.toString())
    }

    private fun readInput(): List<List<Long>> {
        val result: MutableList<List<Long>> = mutableListOf()
        repeat(readInt()) {
            result.add(readListLong())
        }
        return result
    }
}