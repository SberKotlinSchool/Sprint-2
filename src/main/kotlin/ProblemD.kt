class ProblemD {
    fun main() {
        //ваша реализация в методе main
        var t = readInt()
        repeat (t) {
            val n = readInt()
            val m = readLongArray(n)
            m.sort()
            var revenue : Long = 0
            for ( (index, mSum) in m.withIndex()) {
                val topRevenue = mSum * (m.size - index)
                if (revenue <= topRevenue) {
                    revenue = topRevenue
                }
            }
            println(revenue)
        }
    }
}