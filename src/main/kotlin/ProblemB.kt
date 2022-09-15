private const val asciiTableShift = 97

class ProblemB {

    fun main() {
        val requests = readInt()

        for (i in 0 until requests) {
            val data = readStrings()
            val length = data[0].toInt()
            val alphabetPower = data[1].toInt()

            printString(length, alphabetPower)
        }
    }

    fun printString(length: Int, alphabetPower: Int) {
        var string = ""
        for (i in 0 until length) {
            string += Char(code = (i % alphabetPower) + asciiTableShift)
        }

        println(string)
    }
}
