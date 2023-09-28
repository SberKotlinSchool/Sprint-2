class ProblemD {

    fun main() {
        val resultStringBuilder = StringBuilder()
        readInput().forEach {
            val maxProfits: MutableList<Long> = mutableListOf()
            it.sorted().forEachIndexed { index, value ->
                maxProfits.add(value * (it.size - index))
            }
            resultStringBuilder.append(maxProfits.maxOrNull()).append("\n")
        }
        println(resultStringBuilder.toString())
    }

    private fun readInput(): List<List<Long>> {
        val result: MutableList<List<Long>> = mutableListOf()
        repeat(readInt()) {
            readln()
            result.add(readListLong())
        }
        return result
    }

}