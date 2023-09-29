class ProblemD {

    fun main() {

        val lines = readInt()

        for (i in 1..lines) {
            val clients = readInt()
            val clientPrises = readLongArray(clients)
            val priseAndAmount = mutableMapOf<Long, Int>()

            for (prise in clientPrises) {
                if (priseAndAmount.containsKey(prise)) {
                    priseAndAmount[prise] = priseAndAmount[prise]!!.plus(1)
                } else priseAndAmount[prise] = 1
            }

            val sortedPrises = priseAndAmount.toSortedMap(naturalOrder())

            var maximizedGain = 0L
            var clientsProcessed = 0
            for (prise in sortedPrises) {
                val possibleGain = prise.key * (clients - clientsProcessed)
                if (possibleGain > maximizedGain) maximizedGain = possibleGain
                clientsProcessed += prise.value
            }

            println(maximizedGain)
        }
    }

}