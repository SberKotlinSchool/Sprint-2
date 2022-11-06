class ProblemB {

    fun main() {
        val t = readInt()
        repeat(t) {
            val arr = readIntArray(2)
            val n = arr[0]
            val k = arr[1]
            val sb = StringBuilder(n)
            val firstLetter = 'a'.code
            for (i in 0 until n) {
                sb.append((firstLetter + i % k).toChar())
            }
            println(sb)
        }
    }

}