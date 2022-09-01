class ProblemC {

    fun main() {

        //ваша реализация в методе main
        val count = readInt()
        val students = readIntArray(count).sorted()

        var maxCountTasks = 0;
        repeat(students.size) { index ->
            if (index % 2 == 0) {
                maxCountTasks += students[index+1] - students[index]
            }
        }

        println(maxCountTasks)
    }

}