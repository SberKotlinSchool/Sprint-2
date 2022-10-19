class ProblemD {

    fun main() {
        val inputDatasetsQnt = readInt()
        val cashes = ArrayList<List<Long>>(inputDatasetsQnt)
        //input
        for (i in 1..inputDatasetsQnt) {
            val guestsQnt = readInt()
            val guestsCash = readLongArray(guestsQnt).toList()
            cashes.add(guestsCash)
        }
        //output
        for (i in 1..inputDatasetsQnt) {
            println(maxProfitCalculate(cashes[i-1]))
        }
    }
}

/**
 * Расчет максимальной прибыли
 * @property guestsCash список максимально возможной траты на бургер для гостей
 */
fun maxProfitCalculate(guestsCash: List<Long>): Long {
    /*
      В отсортированном массиве примем поочередно кэш i-ого гостя за цену бургера. Тогда прибыль будет равна
      количеству гостей с кэшем не меньше цены, умноженному на цену. Запомним максимальную прибыль.
      На каждом шаге запомним предыдущую цену и пропустим случаи, когда предыдущая цена равна текущей, иначе расчет
      окажется некорректным
     */
    val sortedCashes = guestsCash.sorted()
    var previousPrice: Long = 0
    var maxProfit: Long = 0
    for (i in sortedCashes.indices) {
        val price = sortedCashes[i]
        if (price == previousPrice) continue
        val profit = price * (sortedCashes.size - i)
        if (profit > maxProfit) {
            maxProfit = profit
        }
        previousPrice = price
    }
    return maxProfit
}