class ProblemD {

    fun main() {

        //ваша реализация в методе main
        //println("Введите кол-во измерений")
        val dimensionCnt = readInt()
        repeat(dimensionCnt) {

            //println("Введите кол-во клиентов")
            val clientCnt = readInt()
            //println("Введите через пробел кол-во монет у клиентов (не более $clientCnt)")
            val clientCoinList = readLongArray(clientCnt)
            clientCoinList.sort()

            var profit : Long = 0

            for ( (index, clientCoinAmount) in clientCoinList.withIndex()) {
                //println("index $index")
                //println("clientCoinAmount $clientCoinAmount")
                val betterProfit = clientCoinAmount * (clientCoinList.size - index)
                //println("betterProfit $betterProfit")
                if (profit <= betterProfit) {
                    profit = betterProfit
                }
            }
            println(profit)
        }
    }

}