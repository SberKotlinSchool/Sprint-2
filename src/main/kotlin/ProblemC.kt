class ProblemC {

    fun main() {

        val students = readInt()
        val skills = readIntArray(students)

        skills.sort()

        var tasks = 0
        for (i in 0 until skills.lastIndex step 2) {
            tasks += skills[i + 1] - skills[i]
        }

        println(tasks)
    }

}