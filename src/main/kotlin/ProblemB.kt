class ProblemB {

    fun main() {
        val count = readInt()
        for (i in 1..count) {
            var result = ""
            val (n, k) = readIntArray(2)
            for (j in 0 until n) {
                result += 'a' + (j % k)
            }
            println(result)
        }
    }
}