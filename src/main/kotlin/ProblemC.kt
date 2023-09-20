class ProblemC {

    fun main() {
        val n = readInt()
        val skills = readListInt()

        // Сортируем умения программировать по возрастанию
        val sortedSkills = skills.sorted()

        // Вычисляем разницу между умениями соседних студентов
        val skillDifferences = mutableListOf<Int>()
        for (i in 0 until n step 2) {
            val diff = sortedSkills[i + 1] - sortedSkills[i]
            skillDifferences.add(diff)
        }

        // Суммируем разницы в умениях
        val minTasks = skillDifferences.sum()

        println(minTasks)
    }

}