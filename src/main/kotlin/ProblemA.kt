class ProblemA {

    fun main() {
        val workDir = "problemA"
        val lines = this::class.java.getResource("$workDir/input.txt")!!.readText().lines().toMutableList()
        val count = lines.removeFirst().toInt()

        for (i in 0 until count) {
            var position: Long = 0
            val line = lines[i].split(" ")
            if (line.count() != 3) break

            val count = line[2].toLong() / 2
            if (line[2].toLong() % 2 == 0L) {
                position += count * line[0].toLong() - count * line[1].toLong()
            } else {
                position += (count + 1) * line[0].toLong() - count * line[1].toLong()
            }

            println(position)
        }
    }

}