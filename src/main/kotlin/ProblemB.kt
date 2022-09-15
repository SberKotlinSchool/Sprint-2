class ProblemB {

    fun main() {
        val t: Int = readInt()
        for (index in 1..t) {
            val request = readListInt()
            val length = request[0]
            val count = request[1]
            val result = problemB(length, count)
            println(result)
        }
    }

    private fun problemB(length: Int, count: Int): String {
        var result = ""
        for (index in 0 until length) {
            result += Char(97 + (index % count))
        }
        return result
    }

}