class ProblemB {

    fun main() =
        lines(FOLDERNAME)
            .filterIndexed { index, s -> index != 0 }
            .map {
                it.split(" ")
                    .map { itt -> itt.toInt() }
                    .toIntArray()
            }
            .map { generateOne(*it) }
            .forEach { println(it) }

    fun generateOne(vararg v: Int) =
        ALPHABET.subSequence(0, v[1]).repeat(v[0] / v[1]) + ALPHABET.subSequence(0, v[0] - (v[0] / v[1]) * v[1])

    companion object {
        val ALPHABET = "abcdefghijklmnopqrstuvwxyz"
        val FOLDERNAME = "problemB"
    }

}