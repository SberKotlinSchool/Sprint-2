class ProblemB {

    fun main() {

        val params = readArrayOfIntLists()

        for (i in 0..params.lastIndex) {
            val n = params[i][0]
            val k = params[i][1]
            val minF = n / k
            var addF = n % k
            var res = ""
            for (j in 0 until k) {
                val amount = minF + if (addF-- > 0) 1 else 0
                for (m in 1..amount)
                    res += Char(j + 'a'.code)
            }
            println(res)
        }

    }

}

fun main() {
    ProblemB().main()
}
