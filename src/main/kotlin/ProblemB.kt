class ProblemB {

    fun main() {
        val workDir = "problemB"
        val lines = this::class.java.getResource("$workDir/input.txt")!!.readText().lines().toMutableList()
        val count = lines.removeFirst().toInt()

        val alphabet = "abcdefghijklmnopqrstuvwxyz"

        for (i in 0 until count) {
            val line = lines[i].split(" ")
            val n = line.first().toInt()
            val k = line.last().toInt()

            val freq: Int = n / k + 1
            val charMap = alphabet.subSequence(0, k)

            var result = charMap.repeat(freq).subSequence(0, n)
            println(result)
        }
    }

}