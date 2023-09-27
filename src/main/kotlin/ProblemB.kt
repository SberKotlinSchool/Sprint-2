class ProblemB {
    fun main() {
        val alphabet = "abcdefghijklmnopqrstuvwxyz"
        val t: Int = readInt()
        for (i in 0 until t) {
            val parameters: IntArray = readIntArray(2)
            val n: Int = parameters[0]
            val k: Int = parameters[1]
            var result = ""
            (0..n step k).forEach { _ ->
                result += alphabet.substring(0, k)
            }
            result = result.substring(0, n)
            println(result)
        }
    }


}