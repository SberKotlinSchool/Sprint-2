class ProblemB {

    fun main() {
        repeat(readInt()) {
            println(getString(readListInt()))
        }
    }

    private fun getString(params: List<Int>): String {
        var (strLen, maxLen) = params
        var str = ""
        while (strLen > 0) {
            if (strLen < maxLen) maxLen = strLen
            str += ('a' until 'a' + maxLen).joinToString("")
            strLen -= maxLen
        }
        return str
    }
}
