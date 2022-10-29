class ProblemA {
    fun main() {
        val count = readInt()
        for (i in 1..count) {
            val abk = readLongArray(3)
            val a = abk[0]
            val b = abk[1]
            val k = abk[2]
            println((a - b) * (k / 2) + a * (k % 2))
        }
    }
}