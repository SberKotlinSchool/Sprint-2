class ProblemD {

    fun main() {
        val workDir = "problemD"
        val lines = this::class.java.getResource("$workDir/input.txt")!!.readText().lines().toMutableList()
        val count = lines.removeFirst().toInt() * 2

        for (i in 1..count step 2) {
            val optPrice = lines[i].split(" ").map {
                it.toLong()
            }.sortedDescending().mapIndexed { index, value ->
                value * (index + 1)
            }.maxOrNull()

            println(optPrice)
        }
    }

}