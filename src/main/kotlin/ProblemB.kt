class ProblemB {

    fun main() {
        val count = readInt()
        for (i in 1..count) {
            val request = readListInt()
            val n = request[0]
            val k = request[1]
            println(getString(n, k))
        }
    }

    fun getString(n: Int, k: Int): String {
        var result = ""
        var counter = 0
        for (i in 0 until n) {
            if (counter > k - 1) {
                counter = 0
            }
            result += 'a' + counter
            counter++
        }
        return result
    }
}