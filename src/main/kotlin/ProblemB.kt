class ProblemB {

    fun main() {

        //ваша реализация в методе main
        //output на тестовый input может быть различным!
        val countRequests = readLong()
        for (i in 1..countRequests) {
            println(message = getCharGenerate(readListLong()))
        }
    }

    private fun getCharGenerate(args: List<Long>): String {
        var result = ""
        val (n, k)= args
        for (i in 0 until n){
            result += 'a' + ((i % k).toInt())
        }
        return result
    }
}