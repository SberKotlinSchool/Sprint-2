import java.util.*

class ProblemC {

    fun main() {
        val numOfStudents = readInt()
        val students: IntArray = readIntArray(numOfStudents)
        var sumOfTasks = 0

        Arrays.sort(students)
        for (i in 0 until numOfStudents step 2) {
            sumOfTasks += students[i + 1] - students[i]
        }
        println(sumOfTasks)
    }

}