class ProblemC {

    fun main() {

        val countStudents = readInt()
        var sumTask = 0
        val students = readIntArray(countStudents)
        students.sort()
        for (i in 0..students.size-2 step 2){
            sumTask += students[i+1] - students[i]
        }
        println(sumTask)



    }

}