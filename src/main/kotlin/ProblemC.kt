class ProblemC {

    fun main() {
        val n = readInt()
        val a = readIntArray(n)
        a.sort()
        var res = 0
        for (i in 0 until n step 2) {
            res += a[i + 1] - a[i]
        }
        println(res)
    }

}