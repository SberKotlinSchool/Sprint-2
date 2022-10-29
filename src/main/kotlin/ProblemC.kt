class ProblemC {

    fun main() {
        val n = readInt()
        val studentsQuality = readIntArray(n).sortedArrayDescending()
        var lessons = 0
        for (i in 1..n / 2) {
            lessons += (studentsQuality[2 * (i - 1)] - studentsQuality[2 * i - 1])
        }
        println(lessons)
    }

}