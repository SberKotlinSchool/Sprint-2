class ProblemD {
    fun main() {
        val t = readInt()
        repeat(t) {
            val n = readInt()
            val moneyArray = readLongArray(n)
            val editedMoneyArray = moneyArray.distinct().sorted()
            var moneyMap = HashMap<Long, Int>()

            moneyArray.forEach {
                val key = moneyArray[moneyArray.indexOf(it)]
                val value = moneyArray.count { it == key }
                moneyMap.put(key, value)
            }

            var income: Long = 0
            var quantity = 0
            for (i in editedMoneyArray.reversed()) {
                quantity = moneyMap.getValue(i) + quantity
                val currIncome = i * quantity
                if (currIncome > income) income = currIncome
            }
            println(income)
        }
    }
}