class ProblemB {

    fun main() {
        val t = readInt()
        repeat(t) {
            readIntArray(2).let {
                var s = ""
                for (cur in 0 until it[0]) {
                    s += (97 + (cur % it[1])).toChar()
                }
                println(s)
            }
        }
    }

}