class ProblemC {

    fun main() {
        val cnt = readInt()
        val programmingLevels = readIntArray(cnt).sorted()
        var sum = 0
        for (i in 0 until cnt step 2) {
            sum += programmingLevels[i + 1] - programmingLevels[i]
        }
        println(sum)
    }

}