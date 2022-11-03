class ProblemB {

    fun main() {
        val requestCount = readInt()
        for (r in 1..requestCount) {
            val args = readListInt().toIntArray()
            if (args.size == 2) {
                println(getString(*args))
            }
        }
    }

    private fun getString(vararg params: Int): String {
        var (strLen, maxCharLen) = params
        var str = ""
        while (strLen > 0) {
            if (strLen < maxCharLen) maxCharLen = strLen
            str += ('a' until 'a' + maxCharLen).joinToString("")
            strLen -= maxCharLen
        }
        return str
    }
}
