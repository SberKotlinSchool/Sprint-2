class ProblemD {

    fun main() {
        val t = readInt()
        for (i in 1..t) {
            val n = readInt()
            readLongArray(n).let { moneyArr ->
                val result = moneyArr.maxOf { money ->
                    moneyArr.sumOf { money * if (it < money) 0 else 1 }
                }
                println(result)
            }
        }
    }
}