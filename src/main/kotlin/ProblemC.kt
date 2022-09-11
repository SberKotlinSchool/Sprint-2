class ProblemC {

    fun main() {
        val n = readInt()
        with(readIntArray(n)) {
            sort()
            var countTasks = 0
            for (i in indices step 2) {
                countTasks += get(i + 1) - get(i)
            }
            println(countTasks)
        }
    }
}