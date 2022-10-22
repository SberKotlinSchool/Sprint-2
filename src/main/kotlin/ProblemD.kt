class ProblemD {

    fun main() {
        val t = readInt()
        repeat(t) {
            val n = readInt()
            var max: Long = Long.MIN_VALUE
            readLongArray(n)
                .sortedDescending()
                .forEachIndexed { index, value ->
                    val cur = value * (index + 1)
                    if (cur > max) {
                        max = cur
                    }
                }
            println(max)

        }

    }

}