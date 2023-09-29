class ProblemA {

    fun main() {

        val lines = readInt()
        for (i in 1..lines) {
            val jumpData = readLongArray(3)
            val total = jumpData[2]
            val right = jumpData[0]
            val left = jumpData[1]

            val location = if (total % 2 > 0) {
                right * (total / 2 + 1) - left * (total / 2)
            } else {
                right * (total / 2) - left * (total / 2)
            }

            println(location)
        }

    }

}