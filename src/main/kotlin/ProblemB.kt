private const val SIZE = 2
private const val LETTERS = "abcdefghijklmnopqrstuvwxyz"
private const val FIRST = 0
private const val SECOND = 1

class ProblemB {

    fun main() {
        val count = readInt()

        for (line in 1..count) {
            var s = ""
            val stringParameters = readIntArray(SIZE)
            val stringSize = stringParameters[FIRST]
            val minFrequency = stringParameters[SECOND]
            val repeat = stringSize / minFrequency
            val rest = stringSize % minFrequency
            for (i in 1..repeat) {
                for (j in 0 until minFrequency) {
                    s += LETTERS[j]
                }
            }
            for (i in 0 until rest) {
                s += LETTERS[i]
            }
            when (line) {
                count -> print(s)
                else -> print(s + "\n")
            }
        }
    }
}
