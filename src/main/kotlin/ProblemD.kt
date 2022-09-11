class ProblemD {

    fun main() {

        val setNumber = readInt()

        for (i in 1..setNumber) {

            val customersCount = readInt()
            val fundsArray = readLongArray(customersCount).sortedDescending()

            var maxProfit: Long = 0
            var count: Long = 1

            for (value in fundsArray) {
                if (value * count > maxProfit)
                    maxProfit = value * count
                count++
            }
            println(maxProfit)
        }
    }

}