class ProblemA {

    fun main() {
        val t: Int = readInt()
        for (index in 1..t) {
            val request = readListInt()
            val a = request[0]
            val b = request[1]
            val k = request[2]
            val result = problemA(a.toLong(),b.toLong(),k)
            println(result)
        }
    }

    private fun problemA(a: Long, b: Long, k: Int): Long {
        val isEven: Boolean = k % 2 == 0
        val div: Int

        return if (isEven) {
            div = k / 2
            a * div - b * div
        } else {
            div = k / 2 + 1
            a * div - b * (div - 1)
        }
    }
}