
class ProblemC {

    fun main() {

        //ваша реализация в методе main
        val studentsSkills = readIntArray(readInt()).sortedArrayDescending()
        // можно задавть разные значения параметра numberOfTeamMembers
        val numberOfTeamMembers = 2
        println(studentsSkills.withIndex().sumOf { studentsSkills[it.index - it.index % numberOfTeamMembers] - it.value })
    }
}