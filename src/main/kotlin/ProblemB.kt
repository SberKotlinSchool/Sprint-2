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
        val (strLen, maxCharLen) = params
        var charPos = 0
        var str = ""
        repeat(strLen) {
            str += (65 + charPos).toChar()
            if (charPos == maxCharLen - 1) {
                charPos = 0
            } else {
                charPos++
            }
        }
        return str.lowercase()
    }
}