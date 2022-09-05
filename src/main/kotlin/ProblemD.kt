class ProblemD {

    fun main() {
        //ваша реализация в методе main
        val countInputData = readInt()

        for (i in 1..countInputData) {

            val countBuyers = readInt()

            val payingCapacityBuyersList = readLongSortArray(countBuyers)

            val resultList = getResultList(payingCapacityBuyersList)

            val result = resultList.maxOrNull()
            println(result)
        }
    }

    private fun getResultList(payingCapacityBuyersList: LongArray): MutableList<Long> {
        val resultList = mutableListOf<Long>()

        for ((count, i) in (payingCapacityBuyersList.indices).withIndex()) {
            val profit = payingCapacityBuyersList[i] * (payingCapacityBuyersList.size - count)
            resultList.add(profit)
        }
        return resultList
    }
}