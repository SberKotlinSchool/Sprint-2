class ProblemC {

    fun main() {
        val t: Int = readInt()
        val studentsSkills: IntArray = readIntArray(t)
        studentsSkills.sort()
        val result = problemC(studentsSkills)
        println(result)
    }
    private fun problemC(studentsSkills: IntArray): Int {
        var count = 0
        for (i in studentsSkills.size - 1 downTo 1 step 2) {
            count += (studentsSkills[i] - studentsSkills[i - 1])
        }
        return count
    }
}