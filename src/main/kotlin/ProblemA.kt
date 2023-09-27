class ProblemA {

    fun main() {
        //ваша реализация в методе main
        repeat(readInt()) {
            val (a, b, k) = readLongArray(3)
            println(a * (k / 2 + k % 2) - b * (k / 2))
        }
    }

}