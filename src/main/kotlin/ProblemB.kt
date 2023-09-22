class ProblemB {

    fun main() {
        for (i in 1..readInt()) {
            val arr = readIntArray(2)
            println(getResult(arr[0], arr[1]))
        }
    }

    private fun getResult(n: Int, k: Int): String {
        var s = "a"
        for (i in 1 until n) {
            s += 'a' + (i % k)
        }
        return s
    }
}