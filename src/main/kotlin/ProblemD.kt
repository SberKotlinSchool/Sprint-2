class ProblemD {

    fun main() {
        val queryCount = readInt()
        for (i in 1..queryCount) {
            val clientCount = readInt()
            val money = readLongArray(clientCount).sortedDescending()
            val result = money.sortedDescending().withIndex().maxOf { (it.index + 1) * it.value }
            println(result)
        }
    }

}