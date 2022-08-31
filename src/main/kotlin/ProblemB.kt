class ProblemB {

    fun main() {

        //ваша реализация в методе main
        //output на тестовый input может быть различным!
        val countRequest = readInt()
        for (i in 1..countRequest) {
            var result = ""
            val (n, k) = readIntArray(2)
            for (j in 0 until n) {
                result += 'a' + (j % k)
            }
            println(result)
        }
    }

}