class ProblemC {
    fun main() {
        val studentsCount = readByte()
        validation(studentsCount)

        val studentsSkills = readByteArray(studentsCount.toInt())
        studentsSkills.sort()

        var result = 0;
        for (skillIndex in studentsSkills.indices step 2)
            result += studentsSkills[skillIndex + 1] - studentsSkills[skillIndex]

        println(result)
    }

    private fun validation(count: Byte) = if (count / 2 == 0) throw IllegalArgumentException() else null
}