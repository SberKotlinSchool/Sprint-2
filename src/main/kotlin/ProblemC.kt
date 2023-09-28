class ProblemC {

    fun main() {
        var result = 0
        readInput().sorted()
            .sorted().forEachIndexed { index, value ->
                if (index % 2 == 0) {
                    result -= value
                } else {
                    result += value
                }
            }
        println(result)
    }

    private fun readInput(): List<Int> {
        readln()
        return readln().split(" ").map { it.toInt() }
    }

}