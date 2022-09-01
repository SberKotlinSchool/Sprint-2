class ProblemB {

    fun main() {

        //ваша реализация в методе main
        //output на тестовый input может быть различным!
        //println("Введите количество запросов")
        val requestCnt = readInt()
        repeat(requestCnt) {
            //println("Введите два числа через пробел. Длинна строки и кол-во символов")
            val stringParams = readIntArray(2)
            val stringLength = stringParams[0]
            val charCnt = stringParams[1]
            var resultString = ""
            for (pos in 0 until stringLength) {
                //println("pos = $pos pos%charCnt = ${pos % charCnt}")
                resultString += Char(97 + (pos % charCnt))
            }
            println(resultString)
        }
    }
}