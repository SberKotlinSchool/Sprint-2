class ProblemC {

    fun main() =
        lines(FOLDERNAME)[1]
            .split(" ")
            .map { it.toInt() }
            .sorted()
            .mapIndexed { idx, value -> value * if (idx % 2 == 0) -1 else 1 }
            .sum()
            .let { println(it) }

    companion object {
        val FOLDERNAME = "problemC"
    }
}