import java.io.File

class ProblemD {
fun main() {
    val inputStream = File("src/main/resources/problemD/input.txt").inputStream()
    System.setIn(inputStream)

    val query = readInt()
    repeat(query) {
        val num = readInt()
        var max = Long.MIN_VALUE
        readLongArray(num).sortedDescending().forEachIndexed { index, value ->
            val cur = value * (index + 1)
            if (cur > max) max = cur
        }
        println(max)
    }

}}
