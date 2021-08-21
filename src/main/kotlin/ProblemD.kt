class ProblemD {

    fun main() {
        var entryAmount: Byte = readln().toByte() // 1 <= количество запросов <= 100

        val outputArray = ArrayList<Long>()

        while (entryAmount-- > 0) {
            val clientAmount: Byte = readln().toByte() // 1 <= количество клиентов <= 100
            val coinArray: List<Long> = readListLong().sorted()

            var maxCostTotal: Long = 0

            for (i in 0 until clientAmount) {
                val potCostTotal = ((clientAmount - i) * coinArray[i])
                maxCostTotal = maxOf(maxCostTotal, potCostTotal)
            }
            outputArray.add(maxCostTotal)
        }
        for (el in outputArray) {
            println(el)
        }
    }
    /*
     Алгоритм не оптимальный, так как не исключает всех остальных клиентов после изменения потенциальной максимальной
     стоимости бургера. Возможное улучшение: введение структуры данных(например, пары(pair<n,k>)), которая учитывает
     количество клиентов с определенной суммой монет
  */

}
