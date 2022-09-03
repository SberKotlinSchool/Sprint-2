class ProblemB {
    @JvmField
    val alphabet: Array<Char> = arrayOf(
        'a',
        'b',
        'c',
        'd',
        'e',
        'f',
        'g',
        'h',
        'i',
        'j',
        'k',
        'l',
        'm',
        'n',
        'o',
        'p',
        'q',
        'r',
        's',
        't',
        'u',
        'v',
        'w',
        'x',
        'y',
        'z'
    )

    fun main() {
        //ваша реализация в методе main
        //output на тестовый input может быть различным!
        val requestCount = readInt()
        for (i in 1..requestCount) {
            val params: IntArray = readIntArray(2)
            println(generateString(length = params[0], countDistinctSymbols = params[1]))
        }

    }

    private fun generateString(length: Int, countDistinctSymbols: Int): String {
        var s = ""
        for (i in 0 until length) {
            val index = i % countDistinctSymbols
            s += alphabet[index]
        }
        return s
    }

}