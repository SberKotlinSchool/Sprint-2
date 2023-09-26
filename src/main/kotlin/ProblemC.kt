class ProblemC {

    fun main() {
        val countOfStudents = readInt()
        val studentsSkills = readIntArray(countOfStudents)
        println(
            resolveTasks(studentsSkills)
        )
    }

    private fun resolveTasks(studentsSkills: IntArray): Int {
        var tasksCount = 0
        val studentsSkillsSorted = studentsSkills.sortedArray()
        for (i in studentsSkillsSorted.indices step 2) {
            tasksCount += studentsSkillsSorted[i + 1] - studentsSkillsSorted[i]
        }

        return tasksCount
    }

}