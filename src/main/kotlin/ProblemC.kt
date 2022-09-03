class ProblemC {

    fun main() {
        val workDir = "problemC"
        val lines = this::class.java.getResource("$workDir/input.txt")!!.readText().lines().toMutableList()
        lines.removeFirst().toInt()

        val students = lines.last().split(" ").map { it.toLong() }.sorted()

        var sum = 0L
        for (i in students.indices step 2) {
            sum += students[i+1] - students[i]
        }
        println(sum)
    }

}