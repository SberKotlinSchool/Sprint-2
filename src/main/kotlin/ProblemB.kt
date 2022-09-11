class ProblemB {

    fun main() {
        val t = readInt()
        for (i in 1..t) {
            val nk  = readIntArray(2)
            val n  = nk[0]
            val k  = nk[1]
            val pattern  = ('a'.until('a'.plus(k)))
                .joinToString(separator = "").trim()
            val res = pattern.repeat(n  / k) +
                    pattern.substring(0 until n % k)
            println(res)

        }

    }

}