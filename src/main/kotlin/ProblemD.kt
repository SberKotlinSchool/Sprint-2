class ProblemD {
    fun main() {
        for (transactionIndex in 1..readByte()) {
            val clientsCount = readByte()
            val coinsArray = readLongArray(clientsCount.toInt())
            coinsArray.sort()

            var maxValue = 0L;
            for (coinsIndex in coinsArray.indices) {
                val optionalMaxValue = coinsArray[coinsIndex] * (coinsArray.size - coinsIndex)
                if (optionalMaxValue > maxValue) maxValue = optionalMaxValue
            }

            println(maxValue)
        }
    }

}