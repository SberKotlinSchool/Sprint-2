class ProblemB {

    fun main() {
        val countOfStrings = readInt()
        for (i in 1..countOfStrings) {
            val stringParameters: IntArray = readIntArray(2)
            println(
                resolveString(stringParameters[0], stringParameters[1])
            )
        }
    }

    private fun resolveString(length: Int, countOfSymbols: Int): String {
        val string = StringBuilder()
        for (i in 0 until length) {
            string.append(Char(97 + i % countOfSymbols))
        }
        return string.toString()
    }

}