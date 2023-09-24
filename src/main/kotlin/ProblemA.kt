class ProblemA {
    fun main() {
        val requests = readInt()

        for (i in 0 until requests) {
            val row = readLongArray(3)

            var current = 0L

            for (j in 0 until row[2]) {
                if (j % 2 == 0L) {
                    current += row[0]
                } else {
                    current -= row[1]
                }
            }

            println(current)
        }
    }
}