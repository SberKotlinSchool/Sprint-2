class ProblemD {

    fun main() {
        val t = readInt()
        for (i in 1..t) {
            val n = readInt()
            val m = readLongArray(n)
            m.sort()
            var income : Long = 0
            for ((index, value) in m.withIndex()) {
                val topIncome = value * (m.size - index)
                if (income <= topIncome) {
                    income = topIncome
                }
            }
            println(income)
        }
    }
}