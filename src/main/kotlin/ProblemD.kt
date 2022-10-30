class ProblemD {

    fun main() {
        val cnt = readInt()
        repeat(cnt) {
            val clientCount = readInt()
            val coinAmounts = readListLong()
            val bestPrice = coinAmounts.maxOf { el ->
                el * coinAmounts.count { c -> c >= el }
            }
            println(bestPrice)
        }
    }
}