class ProblemD {
    fun main() =
        lines(FOLDERNAME)
            .filterIndexed { index, s -> index != 0 && index % 2 == 0 }
            .map {
                it.split(" ")
                    .map { it.toLong() }
                    .sortedDescending()
                    .mapIndexed { idx, itt -> itt * (idx + 1) }
                    .maxOrNull()
            }
            .forEach { println(it) }

    companion object {
        val FOLDERNAME = "problemD"
    }
}