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
        val alphabetStr = "abcdefghijklmnopqrstuvwxyz"
        val alphabet = alphabetStr.toCharArray()
        val maxMinFreq = length / count
        var result = ""

        val end: Int
        if (length > alphabet.size) {
            end = length % alphabet.size
            val fullAlphabetCount = (length - end) / alphabet.size
            result = alphabetStr.repeat(fullAlphabetCount)
        } else {
            end = count
        }

        for (index in 1..end) {
            result += alphabet[index - 1]
                .toString()
                .repeat(maxMinFreq)
            if (index == end && count % 2 != 0) {
                result += alphabet[index - 1].toString()
            }
        }

        return result
    }

}