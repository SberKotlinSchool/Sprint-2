class ProblemB {
    private val START = 'a'.code

    fun main() {
        val lines = readInt()
        for (i in 1..lines) {
            val input = readIntArray(2)
            val length = input[0]
            val max = input[1] - 1

            var result = ""
            var current = 0
            while (result.length < length) {
                result += (START + current).toChar()
                current = if (current < max) current + 1 else 0
            }

            println(result)
        }

    }

}