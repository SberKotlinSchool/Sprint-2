class ProblemB {

    fun main() {
        val numOfLines = readInt()
        for (i in 1..numOfLines) {
            val line: IntArray = readIntArray(2)
            val fullStrings = line[0].div(line[1])
            val remain = line[0].mod(line[1])

            for (j in 1..fullStrings) {
                printAlphabetString(line[1])
            }
            printAlphabetString(remain)
            println()
        }
    }

    private fun printAlphabetString(lastIndex: Int) {
        // возможен вариант с использованием строки со всем алфавитом и получением символа из нее по индексу
        val shift = 'a'.code - 1
        val stringBuilder = StringBuilder()

        for (i in 1..lastIndex) {
            stringBuilder.append((shift + i).toChar())
        }
        print(stringBuilder)
    }

}