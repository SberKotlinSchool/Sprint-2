class ProblemC {

    fun main() {
        //ваша реализация в методе main
        val n = readInt()
        val students = readIntArray(n)
        println(formTeams(students))
    }

    private fun formTeams(students: IntArray): Int {
        val studentsSorted = students.sorted()
        return (studentsSorted.indices step 2).toList()
            .fold(0) { s, i -> s + studentsSorted[i + 1] - studentsSorted[i] }
    }
}