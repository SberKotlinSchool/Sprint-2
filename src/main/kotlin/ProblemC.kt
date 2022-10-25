
class ProblemC {

    fun main() {

        //ваша реализация в методе main
        val inputStream = this::class.java.getResource("problemC/input.txt")!!.openStream()
        System.setIn(inputStream)

        val studentsSkills = readIntArray(readInt())
        studentsSkills.sortDescending()

        // можно задавть разные значения параметра numberOfTeamMembers
        // в данном случае numberOfTeamMembers = 2
        println(countProblemNumber(studentsSkills, numberOfTeamMembers = 2))
    }

    private fun countProblemNumber(studentsSkills: IntArray, numberOfTeamMembers: Int): Int {
        var result = 0
        if (numberOfTeamMembers <= studentsSkills.size) {   // are there enough students for at least 1 team?
            for (teamCounter in 0 until studentsSkills.size / numberOfTeamMembers) {
                result += countTeamProblemNumber(studentsSkills, teamCounter * numberOfTeamMembers, numberOfTeamMembers)
            }
        }
        return result
    }

    private fun countTeamProblemNumber(studentsSkills: IntArray, member1Index: Int, numberOfTeamMembers: Int): Int {
        var result = 0
        if (member1Index + numberOfTeamMembers <= studentsSkills.size) { // are there enough members for full team?
            for (teamMemberIndex in member1Index + 1 until member1Index + numberOfTeamMembers) {
                result += studentsSkills[member1Index] - studentsSkills[teamMemberIndex]
            }
        }
        return result
    }
}