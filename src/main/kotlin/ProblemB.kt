class ProblemB {

    fun main() {

        //ваша реализация в методе main
        //output на тестовый input может быть различным!

        val count = readInt()
        for (i in 1..count) {
            val inputData = readIntArray(2)
            println(buildString(inputData))
        }

    }

    private fun buildString(inputData: IntArray): String {
        val n = inputData.get(0)
        val k = inputData.get(1)
        var s = ""

        for (i in 1..n)
            s += Char(97 + (i - 1) % k)
        return s
    }

}

