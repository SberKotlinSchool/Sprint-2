class ProblemC {

    fun main() {
        var sum = 0
        val n: Int = readInt()
        val skills = readIntArray(n)
        skills.sort()
        for (i in 0 until n step 2) {
            sum += skills[i + 1] - skills[i]
        }
        println(sum)
    }

}