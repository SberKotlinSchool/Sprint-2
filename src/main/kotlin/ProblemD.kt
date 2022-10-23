class ProblemD {

    fun main() {
        val inputNum = readInt()
        for (i in 0 until inputNum) {
            val clientNum = readInt()
            val clientsSorted = readLongArray(clientNum).sorted()
            var maxRevenue = Long.MIN_VALUE
            for ((inx, affordablePrice) in clientsSorted.withIndex()) {
                val possibleRevenue = affordablePrice * (clientsSorted.size - inx)
                if (possibleRevenue > maxRevenue) {
                    maxRevenue = possibleRevenue
                }
            }
            println(maxRevenue)
        }
    }

}