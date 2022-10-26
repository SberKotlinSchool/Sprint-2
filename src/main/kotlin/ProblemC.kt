
class ProblemC {

    fun main() {

        //ваша реализация в методе main
        val inputStream = this::class.java.getResource("problemC/input.txt")!!.openStream()
        System.setIn(inputStream)

        // можно задавть разные значения параметра numberOfTeamMembers
        // в данном случае numberOfTeamMembers = 2
        println(countProblemNumber(readIntArray(readInt()).sortedArrayDescending(), numberOfTeamMembers = 2))
    }

    private fun countProblemNumber(studentsSkills: IntArray, numberOfTeamMembers: Int): Int {
        return studentsSkills.withIndex().sumOf {
            if (it.index % numberOfTeamMembers == 0) 0
            else studentsSkills[it.index - it.index % numberOfTeamMembers] - it.value
        }
    }
}