class ProblemD {

    fun main() {
        val t = readInt()
        for (i in 1..t) {
            val n = readInt()
            with(readLongArray(n)) {
                sort()
                var maxProfit = n * first()
                for (j in 1 until size) {
                    val profit = get(j) * (n - j)
                    maxProfit = maxOf(maxProfit, profit)
                }
                println(maxProfit)
            }
        }
    }
}