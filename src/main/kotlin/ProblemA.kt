class ProblemA {
    fun main() {
        val frogs = readInt()

        for (i in 0 until frogs) {
            val stepData = readListLong()

            val left = stepData[0]
            val right = stepData[1]
            val jumps = stepData[2]

            val middle = jumps / 2

            println(
                when (jumps % 2) {
                    0L -> (middle * left) - (middle * right)
                    else -> ((middle + 1) * left) - (middle * right)
                }
            )
        }
    }
}