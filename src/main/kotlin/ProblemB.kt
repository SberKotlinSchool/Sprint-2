class ProblemB {

    fun main() {
        problemB()

    }
    fun problemB() {
//    Введите количество циклов
        val numberOfRequests = readInt()
        repeat(numberOfRequests){
//    Введите два числа длину строки и количество символов через пробел
            val twoValue = readIntArray(2)
            for (i in 0..twoValue[0]) {
                val charCode= 97 + (i % twoValue[1])
                val char = Char(charCode)
                print(char)
            }
            println()
        }
    }
}