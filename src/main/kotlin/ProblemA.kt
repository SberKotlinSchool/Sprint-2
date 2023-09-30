import java.io.File
import java.io.InputStream

class ProblemA {
    val filename = "src/main/resources/problemA/input.txt"
    val delimiter = " "

    fun main() {
        val inputStream: InputStream = File(filename).inputStream()
        val lines = mutableListOf<String>()
        inputStream.bufferedReader().forEachLine { lines.add(it) }

        val linesCount = lines[0].toInt()
        for (i in 1..linesCount) {
            val abk = lines.get(i).split(delimiter);
            val goRightSteps = abk[0].toLong()
            val goLeftSteps = abk[1].toLong()
            val repeatCount = abk[2].toLong()

            var result = ((goRightSteps - goLeftSteps) * (repeatCount / 2))
            if (repeatCount % 2 > 0)
                result += goRightSteps

            println(result)
        }

    }
}