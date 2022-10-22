class ProblemA {

    fun main() {
        val t = readInt()
        repeat(t) {
            val params = readLongArray(3)
            val forward= ((params[2] + 1) / 2 * params[0])
            val backward = (params[2] / 2 * params[1])
            println(forward - backward)
        }

    }

}