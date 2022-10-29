class ProblemD {
    fun main() {
        val input = readInt()
        repeat(input) {
            val clients = readInt()
            val coins = readLongArray(clients)

            coins.sort()

            var maxSum = 0L
            var minCoin = 0L

            for ((i, v) in coins.withIndex()) {
                if (v > minCoin) {
                    val newSum = (clients - i) * v
                    if (newSum > maxSum) {
                        maxSum = newSum
                        minCoin = v
                    }
                }
            }
            println(maxSum)
        }
    }
}