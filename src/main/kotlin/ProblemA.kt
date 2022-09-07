class ProblemA {

    fun main() {

        for(rqStep in 1..readInt()) {
            val (positiveJump, negativeJump, jumpCount) = loadInitialData(readListLong())
            println("${(positiveJump + negativeJump) * (jumpCount / 2) + positiveJump * (jumpCount % 2)}")
        }
    }

    @Throws(IllegalArgumentException::class)
    fun loadInitialData(input: List<Long>): InitialData {
        if (input.size != 3 || input.any { it < 0 }) {
            throw IllegalArgumentException("Initial data error!")
        }
        return InitialData(input.component1(), -input.component2(), input.component3())
    }

    data class InitialData(val positiveJump: Long = 0, val negativeJump: Long = 0, val jumpCount: Long = 0)
}