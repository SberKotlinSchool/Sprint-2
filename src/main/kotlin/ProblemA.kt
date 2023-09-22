class ProblemA {

    fun main() {
        for (i in 1..readInt()) {
            val arr = readLongArray(3)
            println(getResult(arr[0], arr[1], arr[2]))
        }
    }

    private fun getResult(a: Long, b: Long, k: Long) = (a - b) * (k / 2) + a * (k % 2)
}