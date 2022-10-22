import kotlin.math.abs

class ProblemC {

    fun main() {
        val n = readInt()
        val st = readIntArray(n)
            .sorted()
            .chunked(2) { (first, second) -> first to second }
            .filter { it.first != it.second }
            .sumOf { abs(it.first - it.second) }
        println(st)
    }

}