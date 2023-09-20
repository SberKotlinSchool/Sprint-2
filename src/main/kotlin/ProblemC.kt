import java.io.File
import kotlin.math.abs

class ProblemC {
fun main() {

    val inputStream = File("src/main/resources/problemC/input.txt").inputStream()
    System.setIn(inputStream)

    val num = readInt()

    val res = readIntArray(num).sorted()
        .chunked(2) { (first, second) -> first to second }
        .filter { it.first != it.second }
        .sumOf { abs(it.first - it.second) }

    println(res)
} }
