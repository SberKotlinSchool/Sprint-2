class ProblemC {
    fun main() {
        val n = readInt()
        val array = readIntArray(n)
        var count = 0
        val sortedArray = array.sortedArray()
        for (i in sortedArray.size - 1 downTo 0 step 2) {
            count += sortedArray[i] - sortedArray[i - 1]
        }
        println(count)
    }
}