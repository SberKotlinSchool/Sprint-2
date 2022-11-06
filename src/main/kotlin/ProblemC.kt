class ProblemC {

    fun main() {
        val students = readInt()
        val skills = readListInt().sorted()
        println((1..students step 2).sumOf { skills[it] - skills[it - 1] })
    }
}
