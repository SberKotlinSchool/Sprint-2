class ProblemC {

    fun main() {
        //ваша реализация в методе main
        //println("Введите количество студентов")
        val studentCount: Int = readInt()
        //println("Введите навыки програмирования студентов")
        val studentProgramingAbility = readListInt().sorted()
        var taskCount: Long = 0

        for (index in studentProgramingAbility.indices step 2) {

            val firstIndex = studentProgramingAbility[index]
            val secondIndex = studentProgramingAbility[index + 1]

            taskCount += secondIndex - firstIndex
        }
        println(taskCount)
    }
}