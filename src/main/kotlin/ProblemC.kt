class ProblemC {

    fun main() {
        var answer = 0
        val q_students = readInt()
        var data = readListInt().sortedDescending()
        for (i in 1..q_students step 2) answer += (data[i-1] - data[i])
        print(answer)
    }
}