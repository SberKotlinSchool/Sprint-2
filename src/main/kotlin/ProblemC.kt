class ProblemC {

    fun main() {
        val studentsCount = readInt()
        val skillLevels = readListInt().sorted()

        var minTasksCount = 0
        for (i in 1..studentsCount step 2) {
            minTasksCount += skillLevels[i] - skillLevels[i - 1]
        }

        println(minTasksCount)
    }
}