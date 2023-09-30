import java.io.File
import java.io.InputStream

class ProblemC {

    val filename = "src/main/resources/problemC/input.txt"
    val delimiter = " "

    fun main() {

        val inputStream: InputStream = File(filename).inputStream()
        val lines = mutableListOf<String>()
        inputStream.bufferedReader().forEachLine { lines.add(it) }

        val studentsCount = lines[0].toInt()
        var studentsPowersArray = lines[1].split(delimiter).sorted()

        var result = 0
        for(i in 0 until studentsCount step 2) {
            result += studentsPowersArray[i+1].toInt() - studentsPowersArray[i].toInt()
        }

        println(result)
    }

}