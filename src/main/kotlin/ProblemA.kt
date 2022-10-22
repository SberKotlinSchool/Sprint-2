class ProblemA {

    fun main() {
        val t = readInt()
        repeat(t) {
            readLongArray(3).let {
                val forward= ((it[2] + 1) / 2 * it[0])
                val backward = (it[2] / 2 * it[1])
                println(forward - backward)
            }
        }

    }

}