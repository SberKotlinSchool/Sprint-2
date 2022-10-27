class ProblemB {

    fun main() {

        //ваша реализация в методе main
        //output на тестовый input может быть различным!
        Array(readInt()) { readIntArray(2) }.forEach {
            println(String(CharArray(it[0]) { char -> 'a'.plus(char % it[1]) }))
        }
    }
}