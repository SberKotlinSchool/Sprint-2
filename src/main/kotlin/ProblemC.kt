import kotlin.math.abs

class ProblemC {

    fun main() {

        readInt()
        val skills = readListInt().sorted()

        var problems = 0

        for (i in skills.indices step 2) {
            problems += abs(skills[i] - skills[i+1])
        }
        println(problems)
    }
}