class ProblemB {

    fun main() {
        val t = readInt()
        val results = mutableListOf<String>()

        repeat(t) {
            val (n, k) = readListInt()
            val alphabet = ('a'..'z').toList()
            val result = buildString {
                for (i in 0 until n) {
                    append(alphabet[i % k])
                }
            }
            results.add(result)
        }
        results.forEach { println(it) }
    }
}