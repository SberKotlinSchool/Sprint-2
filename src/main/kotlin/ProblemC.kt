class ProblemC {

    fun main() {
        val studentsNumber: Int = readInt()
        val studentsAbilities: IntArray = readIntArray(studentsNumber)

        studentsAbilities.sort()

        var tasksToSolve = 0
        for (i in studentsAbilities.indices step 2) {
            tasksToSolve += studentsAbilities[i + 1] - studentsAbilities[i];
        }

        println(tasksToSolve)
    }

}