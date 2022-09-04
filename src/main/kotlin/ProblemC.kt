class ProblemC {

    fun main() {

        //ваша реализация в методе main
        val numberOfStudents = readInt()
        val studentSkills = readIntArray(numberOfStudents)
        println(minTasks(studentSkills))

    }

    private fun minTasks(skills: IntArray): Int {
        var count = 0;
        val skillsSorted = skills.sorted()
        for (i in skills.indices step 2) {
            count = count + skillsSorted.get(i + 1) - skillsSorted.get(i)
        }
        return count

    }

}