import java.io.File

class ProblemB {
fun main() {

    val inputStream = File("src/main/resources/problemB/input.txt").inputStream()
    System.setIn(inputStream)

    val query = readInt()
    repeat(query) {
        readLongArray(2).let {
            var s = ""
            for (cur in 0 until it[0]) {
                s += (97 + (cur % it[1])).toInt().toChar()
            }
            println(s)
        }
    }
}}