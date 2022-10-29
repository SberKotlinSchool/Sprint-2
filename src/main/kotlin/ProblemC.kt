class ProblemC {

    fun main() {

        println(readIntArray(readInt()).let { students ->
            students.sort()
            var res = 0
            for (i in 1..students.lastIndex step 2) {
                res += students[i] - students[i - 1]
            }
            res
        })

    }

}

fun main() {
    ProblemC().main()
}