class ProblemC {

    fun main() {
        val n = readInt()
        var list = readListInt()
        list = list.sorted()
        var sum = 0
        for (i in 0 until n) {
            if (i % 2 == 0) {
                sum += (list[i+1] - list[i])
            }
        }
        println(sum)
    }
}