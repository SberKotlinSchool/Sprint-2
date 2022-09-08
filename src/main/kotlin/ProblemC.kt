import kotlin.jvm.Throws

class ProblemC {

    fun main() {
        val (studentCount, studentsSmartSkills) = loadInitialData()
        val sortedStudentSmartSkills = studentsSmartSkills.sorted()
        var result = 0
        for (index in 0 until studentCount step 2) {
            result += sortedStudentSmartSkills.get(index + 1) - sortedStudentSmartSkills.get(index)
        }
        println(result)
    }

    @Throws(IllegalArgumentException::class)
    fun loadInitialData(): InitialData {

        val studentsCount: Int = readInt()
        val studentSmartSkills: List<Int> = readListInt()
        if (
            studentsCount <= 0
            || studentSmartSkills.any { it < 0 }
            || studentsCount % 2 != 0
            || studentSmartSkills.size != studentsCount
        )
            throw IllegalArgumentException("Initial data error!")
        return InitialData(studentsCount, studentSmartSkills)
    }

    data class InitialData(val studentsCount: Int = 0, val studentsSmartSkills: List<Int> = emptyList())
}
