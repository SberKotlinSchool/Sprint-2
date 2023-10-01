class ProblemC {

    fun main() {
        val studentCount = readInt()
        val skills = readIntArray(studentCount).sorted()
        val result = skills.chunked(2).sumOf { it.last() - it.first() }
        println(result)
    }

}