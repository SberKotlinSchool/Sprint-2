
class ProblemC {

    fun main() {

        //ваша реализация в методе main
        var totalTaskNum = 0
        readInt()
        val allStudents = readListInt().sorted()
        for (s in 1..allStudents.size step 2)
            totalTaskNum += allStudents[s] - allStudents[s - 1]
        println(totalTaskNum)
    }
}