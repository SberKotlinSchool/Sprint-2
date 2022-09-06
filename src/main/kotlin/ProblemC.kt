class ProblemC {

    fun main() {
        val n = readInt()
        val numberOfTeams = n / 2
        val studentsSkils = readListInt().sorted()
        var minTasksCounter = 0

        if (n % 2 != 0) {
            println("Кол-во команд должно быть четным")
            return
        }

        for (i in studentsSkils.size - 1 downTo 1 step 2) {
            minTasksCounter += (studentsSkils[i] - studentsSkils[i - 1])
        }

        println(minTasksCounter)
        //ваша реализация в методе main
    }

}

