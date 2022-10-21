class ProblemD {

    fun main() {

        //ваша реализация в методе main
        val count = readInt()
        for (r in 1..count) {
            val clients = readLong()
            val moneys = readListLong().distinct().sorted().reversed().toLongArray()
            val profit = getOptProfit(moneys, clients)
            println(profit)
        }
    }

    private fun getOptProfit(moneys: LongArray, clients: Long): Long {
        var res = 0L
        var cnt = 1
        if (moneys.size == 1) {
            return clients * moneys[0]
        }
        for (m in moneys) {
            val nextRes = m * cnt
            val prevSum = res * (cnt - 1)
            if (nextRes >= prevSum) {
                res = m
                cnt++
            }
            if (nextRes < prevSum) {
                cnt--
                break
            }
        }
        return res * cnt
    }
}