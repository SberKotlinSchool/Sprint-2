class ProblemC {

    fun main() {
        val studentsCount = readInt()
        val studentsExp = readListInt().sorted()
        var step = 0
        var result = 0
        while (step < studentsCount) {
            result += studentsExp[step + 1] - studentsExp[step]
            step += 2
        }
        println(result)
    }
}