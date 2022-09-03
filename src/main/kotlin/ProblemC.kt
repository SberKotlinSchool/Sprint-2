class ProblemC {

    fun main() {

        //ваша реализация в методе main
        val countStudents = readInt()
        val skills: IntArray = readIntArray(countStudents)
        println(calculateTaskCount(skills))

    }

    private fun calculateTaskCount(skills: IntArray): Int {
        skills.sort()
        var taskCount = 0
        for (i in 0 until skills.size / 2) {
            taskCount += skills[2 * i + 1] - skills[2 * i]
        }
        return taskCount
    }
}