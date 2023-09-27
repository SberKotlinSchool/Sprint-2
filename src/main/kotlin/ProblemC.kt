class ProblemC {

    fun main() {

        readLine()!!
        readLine()!!.split(" ")
            .asSequence()
            .map { it.toInt() }
            .toList()
            .sorted()
            .mapIndexed { index, value ->
                if (index % 2 == 0) {
                    -value
                } else {
                    value
                }
            }
            .sum()
            .print()

    }

}

private fun Int.print() {
    println(this)
}