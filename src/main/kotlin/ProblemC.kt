class ProblemC {

    fun main() {

        //ваша реализация в методе main
        val countStudents = readInt()
        var result = 0

        val skillValueStudents = readIntArray(countStudents)
        skillValueStudents.sort()
        val size = skillValueStudents.size

        val resultList = mutableListOf<Int>()

        for (i in 0 until size step 2) {
            val differenceSkillValue = skillValueStudents[i + 1] - skillValueStudents[i]
            resultList.add(differenceSkillValue)
        }

        resultList.forEach { i -> result += i }

        print(result)
    }
}