class ProblemD {

    fun main() {
        val iterations = readInt()

        for (i in 1..iterations) {
            val numberOfClients = readLong()
            val clientsBalance = readListLong().sorted()
            var margin: Long = 0

            for (j in clientsBalance.size - 1 downTo 0) {

                val burgerCost = clientsBalance[j]
                val clientsCanBuy = clientsBalance.filter { it >= burgerCost }

                if (margin < clientsCanBuy.size * burgerCost) {
                    margin = clientsCanBuy.size * burgerCost
                }
            }
            println(margin)
        }
    }
}

