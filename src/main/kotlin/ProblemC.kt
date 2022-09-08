class ProblemC {

    fun main() {

        val studentsNum = readInt()
        val array = readIntArray(studentsNum)
        array.sort()
        var ans = 0
        var i = 0

        while (i < studentsNum) {
            ans += array[i + 1] - array[i]
            i += 2
        }
        println(ans)
    }

}