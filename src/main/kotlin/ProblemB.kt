class ProblemB {

    fun main() {
        val countRequest = readInt()
        repeat(countRequest) {
            val data = readListInt()
            val n = data[0]
            val k = data[1]
            val alphabet = Array(k) { c -> ('a' + c) }
            repeat(n) {
                print(alphabet[it % k])
            }
            println()
        }

    }

}