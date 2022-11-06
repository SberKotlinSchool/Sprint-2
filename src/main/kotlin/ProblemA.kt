class ProblemA {

    fun main() {
        val t = readInt()
        repeat(t) {
            val arr = readIntArray(3)
            var res = 0L
            for (i in 0 until arr[2]) {
                res += if (i % 2 == 0) arr[0] else -arr[1]
            }
            println(res)
        }
    }

}