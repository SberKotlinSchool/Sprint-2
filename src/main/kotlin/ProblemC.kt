class ProblemC {

    fun main() {

        val numberOfStudents = readInt()
        val students = readIntArray(numberOfStudents)

        println(getMin(students))

    }

    fun getMin(students: IntArray): Int{
        students.sort()
        var sum = 0
        for(i in 0 until (students.size/2)){
            sum += students[2*i + 1] - students[2 * i]
        }
        return sum
    }

}