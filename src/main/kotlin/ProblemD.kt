class ProblemD {

    fun main() {

        readInputProblemD().forEach { clients ->
            clients.sorted()
                .mapIndexed { index, client -> client * (clients.size - index) }
                .maxOrNull()
                .print()
        }

    }

}

private fun readInputProblemD(): List<List<Long>> {
    val input: MutableList<List<Long>> = mutableListOf()
    repeat(readLine()!!.toInt()) {
        readLine()
        input.add(readLine()!!.split(" ").map { it.toLong() })
    }
    return input
}

private fun Long?.print() {
    println(this)
}