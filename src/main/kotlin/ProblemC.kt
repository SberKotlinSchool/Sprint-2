class ProblemC {

    fun main() {
        val n = readInt()
        val arrayInt = readIntArray(n)
        arrayInt.sort()
        var count = 0
        for (i in arrayInt.indices step 2) {
            count = count + arrayInt[i+1] - arrayInt[i]
        }
        println(count)
    }
}