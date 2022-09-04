class ProblemA {

    fun main() =
        this::class.java.getResource("problemA/input.txt")!!.readText()
            .split("\r\n")
            .filterIndexed { index, s -> index != 0 }
            .map {
                it.split(" ")
                    .map { itt -> itt.toLong() }
                    .toLongArray()
            }
            .map { `define frog position`(*it) }
            .map { it.toString() + "\n" }
            .reduce { acc, s -> acc + s }

    fun `define frog position`(vararg v: Long) = (v[0] - v[1]) * (v[2] / 2) + v[2] % 2 * v[0]
}