import kotlin.math.abs

class ProblemC {

    fun main() {
        // Drop students count
        kotlin.io.readln()

        val studentsSkills = readStrings().map { it.toInt() }.sorted()

        var result = 0
        var prevStudentSkill: Int? = null
        studentsSkills.forEach {
            if (prevStudentSkill == null)
                prevStudentSkill = it
            else {
                result += abs(prevStudentSkill!! - it)
                prevStudentSkill = null
            }
        }

        println(result)
    }

}
