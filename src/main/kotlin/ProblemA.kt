import java.io.File

class ProblemA {
fun main() {
    val inputStream = File("src/main/resources/problemA/input.txt").inputStream()
    System.setIn(inputStream)

    val query = readInt()
    repeat(query) {
        readLongArray(3).let {
            val right = ((it[2] + 1) / 2 * it[0])
            val left = (it[2] / 2 * it[1])
            println(right - left)
        }
    }
}}