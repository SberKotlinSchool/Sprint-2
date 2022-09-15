class ProblemD {

    fun main() {
        val t: Int = readInt()
        for (index in 1..t) {
            val n = readInt()
            val clients = readLongArray(n)
            clients.sort()
            val result = problemD(clients)
            println(result)
        }
    }

    fun problemD(clients: LongArray): Long {
        var totalSum: Long = 0
        for (index in 0..clients.size - 1) {
            val numberOfClients = clients.size - index
            val tempTotal = (numberOfClients * clients[index])
            if (tempTotal > totalSum) {
                totalSum = tempTotal
            }
        }
        return totalSum
    }

}