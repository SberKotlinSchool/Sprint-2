class ProblemD {
    fun main() {
        (1..readInt()).forEach {
            val c = readInt()
            val l = readListLong()
            println(l.sortedDescending().withIndex().maxOf { (it.index + 1) * it.value })
        }
    }
}