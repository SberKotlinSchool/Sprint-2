class ProblemD {

    fun main() {
        var rowsCount = readInt();
        for (i in 1..rowsCount) {
            val array = readLongArray(readInt())
                .sortedArrayDescending()
                .withIndex();
            println(array.maxOf { (it.index + 1) * it.value })
        }
    }
}