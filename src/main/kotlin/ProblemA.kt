class ProblemA {

    fun main() {

        val requestCount = readInt()

        for (i in 0 until requestCount) {

            val currentRequest = readIntArray(3) // [a, b, k]

            val leftJumps = (currentRequest[2] / 2).toLong()
            val rightJumps = leftJumps + currentRequest[2] % 2

            println(currentRequest[0] * rightJumps - currentRequest[1] * leftJumps)
        }

    }

}