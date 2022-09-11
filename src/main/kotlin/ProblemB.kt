class ProblemB {

    fun main() {

        val requestCount = readInt()

        for (i in 1..requestCount) {

            val currentRequest = readIntArray(2)
            val output = StringBuffer(currentRequest[0])

            for (j in 0 until currentRequest[0]) {
                output.append('a' + j % currentRequest[1])
            }
            println(output)
        }

    }

}