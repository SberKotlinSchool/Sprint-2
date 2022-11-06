class ProblemD {

    fun main() {
        val t = readInt()
        repeat(t) {
            val n = readInt()
            val a = readLongArray(n)
            a.sort()
            var res = 0L
            for (i in 0 until n) {
                val profit = a[i] * (n - i)
                if (profit > res) res = profit
            }
            println(res)
        }
    }

}