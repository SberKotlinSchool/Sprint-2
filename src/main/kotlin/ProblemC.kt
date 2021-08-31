class ProblemC {

    fun main() {
        problemC()

    }
    fun problemC() {
//    Введите количество студентов
        val students = readInt()
//    Введите для каждого студента значение умения программировать через пробел
        val programmingSkills = readIntArray(students)
        programmingSkills.sort()
        var miniNumberOfTasks = 0
//    Вычисляем минимальное количество задач для формирования команд
        for (i in 0..programmingSkills.size - 2) {
            if (i % 2 != 0) continue
            miniNumberOfTasks += programmingSkills[i + 1] - programmingSkills[i]
        }
        print(miniNumberOfTasks)
    }

}