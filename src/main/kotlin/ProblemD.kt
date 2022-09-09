class ProblemD {

    fun main() {

        val t = readInt()
        for(i in 1..t){
            val countClients = readInt()
            val price = readLongArray(countClients)
            price.sort()
            var maxProfit = 0L
            var maxPrice = 0L
            for(j in 0..countClients-1) {
                    maxPrice = price[j]*(countClients-j)

                if(maxPrice>maxProfit)
                    maxProfit = maxPrice
            }
            println(maxProfit)
        }

    }

}