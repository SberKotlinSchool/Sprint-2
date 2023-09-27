class ProblemC {

    fun main() {
        //ваша реализация в методе main
        val result = readIntArray(readInt())
            .sorted()
            .chunked(2)
            .map { it.last() - it.first() }
            .sum()
        println(result)
    }

}