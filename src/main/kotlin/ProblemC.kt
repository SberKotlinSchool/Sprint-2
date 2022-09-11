class ProblemC {

    fun main() {

        val studentsCount = readInt()
        val skillArray = readIntArray(studentsCount) // [5, 10, 2, 3, 14, 5]

        skillArray.sort() // [2, 3, 5, 5, 10, 14]

        var result = 0

        for (item in skillArray) {
            result = item - result
        }

        println(result)
    }
}