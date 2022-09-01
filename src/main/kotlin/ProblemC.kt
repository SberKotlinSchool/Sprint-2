class ProblemC {

    fun main() {

        //ваша реализация в методе main
        val countStudents = readInt()
        val students = readIntArray(countStudents)
        students.sortDescending()
        var result = 0
        for (i in 0 until countStudents step 2) {
            result += students[i] - students[i + 1]
        }
        println(result)
    }

}