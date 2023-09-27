class ProblemA {

    fun main() {
        val t: Int = readInt()
        for (i in 0 until t) {
            val parameters: LongArray = readLongArray(3)
            val a: Long = parameters[0]
            val b: Long = parameters[1]
            val k: Long = parameters[2]
            if ((k % 2).toInt() == 0) {
                println(a * (k / 2) - b * (k / 2))
            } else {
                println(a * (k / 2 + 1) - b * (k / 2))
            }
        }

    }

}