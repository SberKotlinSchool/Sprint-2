class ProblemB {

    fun main() {
        val t = readInt()
        for (i in 1..t) {
            val (n, k) = readIntArray(2)
            println(CharArray(n) {'a' + (it % k)})
        }
    }
}