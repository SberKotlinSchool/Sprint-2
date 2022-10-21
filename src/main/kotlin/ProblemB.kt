class ProblemB {

    fun main() {

        //ваша реализация в методе main
        //output на тестовый input может быть различным!
        val count = readInt()
        for (r in 1..count) {
            val args = readListInt().toIntArray()
            if (args.size == 2) {
                println(getRandomChars(*args))
            }
        }
    }

    private fun getRandomChars(vararg params: Int): String {
        val (strLen, charLen) = params
        var cnt = 0
        var charPos = 0
        var res = ""
        while (cnt < strLen) {
            res += (65 + charPos).toChar().lowercase()
            if (charPos == charLen - 1) {
                charPos = 0
            } else {
                charPos++
            }
            cnt++
        }
        return res
    }
}