class ProblemA {

    fun main() {
        val countRequest = readLong()
        for (i in 1..countRequest) {
            val (a, b, k) = readLongArray(3)
            println((k - k / 2) * a - k / 2 * b)
        }
    }

}