class ProblemB {
    fun main() {
        val steps = readInt()

        for (s in 0 until steps) {
            readIntArray(2).let {
                val length = it[0]
                val letters = it[1]

                val string = StringBuilder(length)

                for (i in 0 until length) {
                    string.append((i % letters).toChar() + 97)
                }
                println(string)
            }
        }
    }
}