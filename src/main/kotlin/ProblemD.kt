class ProblemD {
    fun main() =
        this::class.java.getResource("problemD/input.txt")!!.readText()
            .split("\r\n")
            .filterIndexed { index, s -> index != 0 && index % 2 == 0 }
            .map {
                it.split(" ")
                    .map { it.toLong() }
                    .sortedDescending()
                    .mapIndexed { idx, itt -> itt * (idx + 1) }
                    .maxOrNull()
            }
            .map { it.toString() }
            .reduce { acc, s -> acc + "\n" + s }
}