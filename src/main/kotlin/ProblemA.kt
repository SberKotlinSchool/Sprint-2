class ProblemA {

    fun main() {

        val rqNum = readInt()

        for (i in 1..rqNum) {
            var ans = 0L
            val data = readLongArray(3)
            val jumpA = data[0]
            val jumpB = data[1]
            val jumpCount = data[2]
            for (j in 1..jumpCount) {
                if ((j % 2) == 1L) {
                    ans += jumpA
                } else {
                    ans -= jumpB
                }
            }
            println(ans)
        }
    }
}