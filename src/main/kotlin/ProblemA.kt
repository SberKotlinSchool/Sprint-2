class ProblemA {

    fun main() =
        lines(FOLDERNAME)
            .filterIndexed { index, s -> index != 0 }
            .map {
                it.split(" ")
                    .map { itt -> itt.toLong() }
                    .toLongArray()
            }
            .map { `define frog position`(*it) }
            .forEach { println(it) }

    fun `define frog position`(vararg v: Long) = (v[0] - v[1]) * (v[2] / 2) + v[2] % 2 * v[0]

    companion object {
        val FOLDERNAME = "problemA"
    }
}