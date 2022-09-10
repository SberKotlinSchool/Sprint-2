import java.io.InputStream
import kotlin.math.abs

class ProblemC {
    companion object {
        private const val maxSkill = 100
    }

    /**
     * Поиск индекса навыка с наименьшей разницей с указанным навыком
     */
    private fun findNearestSkillIndex(skill: Int, studentsSkills: MutableList<Int>): Int {
        var result = 0
        var difference = maxSkill
        studentsSkills.forEachIndexed { index, item ->
            if (abs(item - skill) < difference) {
                difference = abs(item - skill)
                result = index
            }
        }
        return result
    }

    private fun formTeam(studentsSkills: MutableList<Int>): Pair<Int, Int> {
        val skill1 = studentsSkills[0]
        studentsSkills.removeAt(0)

        val nearestSkillIndex = findNearestSkillIndex(skill1, studentsSkills)
        val skill2 = studentsSkills[nearestSkillIndex]
        studentsSkills.removeAt(nearestSkillIndex)

        return Pair(skill1, skill2)
    }

    /**
     * По идее, нужна ещё константа, чтобы можно было набирать группы
     * с произвольным количеством студентов, но в рамках этой задачи
     * примем, что может быть только по двое в команде
     */
    private fun countTasksAmount(studentsSkills: MutableList<Int>): Int {
        var result = 0

        while (studentsSkills.isNotEmpty()) {
            val team = formTeam(studentsSkills)
            result += abs(team.first - team.second)
        }

        return result
    }

    fun main() {
        val inputStream: InputStream = this::class.java.getResource("problemC/input.txt").openStream()
        System.setIn(inputStream)

        val studentsAmount = readInt()
        val studentsSkills = readIntArray(studentsAmount).toMutableList()

        val tasksAmount = countTasksAmount(studentsSkills)
        println(tasksAmount)
    }

}