class ProblemB {
    fun main() {
        (1..readInt()).forEach {
            val (a, b) = readListInt()
            val l = ('a'..'z')
            val ans = (0 until a)
                .map { l.elementAt(it % b) }
                .joinToString("")
            println(ans)
        }
    }
}