class ProblemB {

    fun main() {
        val t = readInt()
        for (i in 1..t) {
            val nk  = readIntArray(2)
            val n  = nk[0]
            val k  = nk[1]
            val numOfEach = n / k
            var res = ""
            ('a'..('a'.plus(k - 1))).forEach{
                res += it.toString().repeat(numOfEach)
                res += if (n % k > it.minus('a')) it.toString() else ""
            }
            println(res)

        }

    }

}