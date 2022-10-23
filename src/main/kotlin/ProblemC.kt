import kotlin.math.abs

private const val WINDOW_SIZE = 2

class ProblemC {

    fun main() {
        val studentsSkills = readIntArray(readInt())

        val result = studentsSkills.asSequence()
            .sorted()
            .windowed(WINDOW_SIZE, WINDOW_SIZE) { (first, second) -> abs(first - second) }
            .sum()

        println(result)
    }
}
