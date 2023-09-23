class ProblemD {

    fun main() {
        val t = readInt()
        for (i in 1..t) {
            val n = readInt()
            val a = readLongArray(n)
            println(getMaxProfit(a))
        }
    }
    fun getMaxProfit(a: LongArray): Long = a.sortedDescending().withIndex().maxOf { (it.index + 1) * it.value }
}