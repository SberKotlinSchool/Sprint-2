class ProblemB {

    fun main() {
        repeat(readInt()) {
            val (n, k) = readListInt()
            println(generateLine(n, k))
        }
    }

    private fun generateLine(length: Int, lettersNum: Int): String {
        val minLetterFreq = length / lettersNum
        val letterReminder = length % lettersNum

        val builder = StringBuilder(length)

        val fullSegment = generateSegment(lettersNum)
        repeat(minLetterFreq) { builder.append(fullSegment) }

        if (letterReminder > 0) {
            builder.append(generateSegment(letterReminder))
        }
        return builder.toString()
    }

    private fun generateSegment(regionLength: Int): String =
        ('a' until ('a' + regionLength)).joinToString(separator = "")
}
