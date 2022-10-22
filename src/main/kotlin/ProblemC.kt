class ProblemC {

    fun main() {
        val size = readInt()
        val levels = readIntArray(size)
        levels.sort()
        var minTasks = 0
        for (i in 0 until size step 2) {
            minTasks += levels[i + 1] - levels[i]
        }
        print(minTasks)
    }
}
