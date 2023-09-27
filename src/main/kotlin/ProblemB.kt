class ProblemB {

    fun main() {
        //ваша реализация в методе main
        //output на тестовый input может быть различным!

        repeat(readInt()) {
            val (n, k) = readIntArray(2)
            repeat(n) {
                print('a' + (it % k))
            }
            println()
        }
    }

}