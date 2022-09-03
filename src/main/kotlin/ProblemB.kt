class ProblemB() {
    fun main() {
        for (requestIndex in 1..readByte()) {
            val inputArray = readByteArray(2)
            validation(inputArray[0], inputArray[1])

            val alphabetSize: Int = inputArray[1].toInt()
            var result = "";

            for (charIndex in 0 until inputArray[0]) {
                result += 'a' + charIndex % alphabetSize
            }
            println(result)
        }
    }

    private fun validation(wordSize: Byte, charCount: Byte) =
        if (wordSize < charCount) throw IllegalArgumentException() else null
}