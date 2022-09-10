class ProblemC {

    fun main() {
        val n = readInt()
        readIntArray(n).sorted().let { skills ->
            var countTasks = 0
            for (i in skills.indices step 2) {
                countTasks += skills[i + 1] - skills[i]
            }
            println(countTasks)
        }
    }
}