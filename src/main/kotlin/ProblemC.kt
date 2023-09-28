class ProblemC {
    fun main() {
        val students = readInt()
        val skills = readIntArray(students)
        skills.sort()

        var taskAmount = 0
        for (i in 0 until students step 2) {
            taskAmount += skills[i + 1] - skills[i]
        }
        println(taskAmount)
    }
}