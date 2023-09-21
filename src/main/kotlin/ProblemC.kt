class ProblemC {

    /**
     * Формирование команд
     */
    fun main() {

        val studentCount = readInt()
        if (studentCount % 2 != 0 || studentCount == 0) {
            throw IllegalArgumentException("Ожидается четное количество студентов")
        }

        var studentsSkills = readListInt()//Умение умений студентов выраженное в баллах

        //Отсортируем студентов по умности, разобьем по парам.
        //Тот кто в паре окажется глупее, будет решать столько задач, сколько нужно, чтобы догнать соседа

        studentsSkills = studentsSkills.sortedDescending()
        var minTaskToSolve = 0;
        var i = 0
        while (i < studentCount) {
            if (studentsSkills[i] > studentsSkills[i + 1]) {
                minTaskToSolve += studentsSkills[i] - studentsSkills[i + 1]
            }

            i += 2
        }
        println(minTaskToSolve)

    }

}