class ProblemD {

    fun main() {

        val t = readInt()

        for (i in 1..t) {
            readInt()
            val money = readListLong()

            var maxIncome : Long = 0

            for (a in money) {
                val currIncome : Long = money.filter { it >= a }.size * a
                if (currIncome > maxIncome)
                    maxIncome = currIncome
            }
            println(maxIncome)
        }
    }
}