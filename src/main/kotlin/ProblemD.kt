class ProblemD {

    fun main() {
        repeat(readInt()) {
            readLine()
            val list = readLine()!!.split(" ").map { it.toLong() }
            println(list.maxOf { element -> element * list.count { cur -> cur >= element } })
        }
    }
}