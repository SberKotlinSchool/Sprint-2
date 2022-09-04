import java.util.*
import java.util.stream.Collectors

class ProblemD {

    fun main() {
        var numberOftestCases = readLine()
        if (numberOftestCases != null) {
            for (i in 1..numberOftestCases.toInt()) {
                processCustomers(readLine())
                if(i < numberOftestCases.toInt()) print("\n")
            }
        }
    }

    private fun processCustomers(customers: String?) {
        var customersMoney = readLine()?.split(" ")?.stream()?.map { l -> l.toLong() }?.collect(Collectors.toList())
        var maxRevenue = 0L
        /*var bestMinPrice = 0L*/
        if(customersMoney != null) {
            var minPrice = customersMoney.get(0)
            var maxPrice = customersMoney.get(0)
            for(c in customersMoney) {
                if (c > maxPrice) maxPrice = c
                if (c < minPrice) minPrice = c
            }

            var nextMinPrice = 0L

            do {
                nextMinPrice = maxPrice
                var possibleRevenue = 0L
                for(c in customersMoney) {
                    if (c < nextMinPrice && c > minPrice) nextMinPrice = c
                    if(c >= minPrice) possibleRevenue += minPrice
                }
                if (maxRevenue < possibleRevenue) {
                    maxRevenue = possibleRevenue
                    /*bestMinPrice = minPrice*/
                }
                possibleRevenue = 0L
                if(minPrice == maxPrice) maxPrice = 0L
                minPrice = nextMinPrice
            } while (nextMinPrice <= maxPrice)

            print(maxRevenue)
            /*print(bestMinPrice)*/
        }
    }

}