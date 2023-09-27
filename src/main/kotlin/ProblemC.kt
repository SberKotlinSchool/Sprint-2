class ProblemC {
    fun main() {
        val size = readInt()
        val arr = readIntArray(size)
        println(arr.sorted().chunked(2).fold(0) { a, (f,l) -> a + (l - f) })
    }
}