class ProblemD {

    fun main() {
        for (tests in 1..readInt()) {
            val clientsT : Int = readInt()
            // Предполагаю, что сортировка делается за O(n*log(n))
            val pricesA = readLongArray(clientsT)
            pricesA.sort()
            var maxProfit : Long = 0
            for (i in 0 until clientsT) {
                val currentProfit = pricesA[i] * (clientsT - i)
                maxProfit = if ( currentProfit > maxProfit)
                    currentProfit
                else maxProfit

            }
            println(maxProfit)

        }
    }

}
