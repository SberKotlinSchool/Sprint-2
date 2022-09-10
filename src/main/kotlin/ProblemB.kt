class ProblemB {

    fun main() {

        val rqNum = readInt()

        for (i in 1..rqNum) {
            val data = readIntArray(2)
            val len = data[0]
            val lettersNum = data[1]
            val outputStream = StringBuffer(len)

            for (j in 0 until len) {
                outputStream.append('a' + j % lettersNum)
            }
            println(outputStream)
        }

    }

}