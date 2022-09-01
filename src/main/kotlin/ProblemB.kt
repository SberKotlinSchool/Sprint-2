class ProblemB {

    fun main() {

        //ваша реализация в методе main
        //output на тестовый input может быть различным!
        val count = readInt()
        for (i in 1..count) {
            val args = readIntArray(2)
            println(buildMaxMinString(args[0], args[1]))
        }

    }

    private fun buildMaxMinString(n: Int, k: Int): String {
        var s = ""
        for (i in 1..n) {
            val ch = (97 + (i - 1) % k).toChar()
            s += ch
        }
        return s
    }
}