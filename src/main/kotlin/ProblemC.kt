class ProblemC {

    fun main() =
        this::class.java.getResource("problemC/input.txt")!!.readText()
            .split("\r\n")[1]
            .split(" ")
            .map { it.toInt() }
            .sorted()
            .mapIndexed { idx, value -> value * if (idx % 2 == 0) -1 else 1 }
            .sum()

}