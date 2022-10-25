class ProblemD {

    fun main() {

        //ваша реализация в методе main
        val inputStream = this::class.java.getResource("problemD/input.txt")!!.openStream()
        System.setIn(inputStream)

        for (caseCounter in 1..readInt()) {
            val coinsOwners = readLongArray(readInt())
            coinsOwners.sortDescending()
            var maxProfit = 0L

            for (coinsOwnerIndex in coinsOwners.indices) {
                val profit = coinsOwners[coinsOwnerIndex] * (coinsOwnerIndex + 1)
                if (profit > maxProfit) {
                    maxProfit = profit
                } else if (profit < maxProfit) {
                    break
                }
            }
            println(maxProfit)
        }
    }

}