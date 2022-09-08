import kotlin.jvm.Throws

class ProblemB {

    fun main() {

        for (rqStep in 1..readInt()) {
            var result = ""
            val (length, maxLetterIndex) = loadInitialData(readListInt())
            for (position in 0 until length) {
                result += ('a' + position % maxLetterIndex)
            }
            println(result)
        }
    }

    @Throws(IllegalArgumentException::class)
    fun loadInitialData(input: List<Int>): InitialData {
        val length:Int = input.component1()
        val maxLetterIndex:Int = input.component2()
        if (input.size != 2 || input.any { it <= 0 } || length < maxLetterIndex || maxLetterIndex > 26)
            throw IllegalArgumentException("Initial data error!")
        return InitialData(length, maxLetterIndex)
    }

    data class InitialData(val length: Int = 0, val maxLetterIndex: Int = 0)
}

