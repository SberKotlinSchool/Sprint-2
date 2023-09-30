import java.io.File
import java.io.InputStream

class ProblemB {

    val ABC = "abcdefghijklmnopqrstuvwxyzabcdefgh"
    val MAX_ABC_SYMBOLS = ABC.length

    val filename = "src/main/resources/problemB/input.txt"
    val delimiter = " "

    fun main() {
        val inputStream: InputStream = File(filename).inputStream()
        val lines = mutableListOf<String>()
        inputStream.bufferedReader().forEachLine { lines.add(it) }

        val linesCount = lines[0].toInt()
        for (i in 1..linesCount) {
            val abk = lines.get(i).split(delimiter);
            val stringLength = abk[0].toInt()
            val abcLength = abk[1].toInt()
            val abcToUseString = ABC.substring(0, abcLength)

            var result = ""
            var abcIndex = 0;
            for (j in 0..stringLength - 1) {
                result += abcToUseString[abcIndex]
                abcIndex++
                if (abcIndex >= abcLength)
                    abcIndex = 0
            }

            println(result)
        }

    }

}