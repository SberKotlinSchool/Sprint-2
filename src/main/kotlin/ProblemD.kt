class ProblemD {

    /**
     * Максимизация прибыли при расчете цены за гамбургер
     */
    fun main() {
        val casesCount = readInt()//Количество наборов вх.данных
        var case = 0
        while (case < casesCount) {
            val clientTotalCount = readInt()
            val customersMoney = readListLong()

            println(clientCase(clientTotalCount, customersMoney))
            case++
        }
    }

    /**
     * @param customersMoney Список количества монет у клиентов
     * @return Максимальная выручка заведения по оптимальной цене за единицу товара
     */
    private fun clientCase(clientTotalCount: Int, customersMoney: List<Long>): Long {
        val customersMoneySorted = customersMoney.sorted() //сортируем по возрастанию от бедных к богатым

        var price = customersMoneySorted[0]//Начальная цена за 1 гамбургер
        var totalRevenue = price//Итоговая выручка
        var clientNum = 1

        while (clientNum < clientTotalCount) {
            //Если с текущего и оставшихся клиентов выручка будет больше чем выручка со всех по старой цене, то меняем цену.
            if (customersMoneySorted[clientNum] > price && customersMoneySorted[clientNum] * (clientTotalCount - clientNum) > price * clientNum) {
                price = customersMoneySorted[clientNum]
                totalRevenue = customersMoneySorted[clientNum]
            } else {
                //Увеличиваем выручку по старой цене
                totalRevenue += price
            }
            clientNum++
        }
        return totalRevenue
    }

}