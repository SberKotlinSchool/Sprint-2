class ProblemB {

    fun main() {
        val inputStringsQnt = readInt()
        val generators = ArrayList<StringGenerator>(inputStringsQnt)
        //input
        for (i in 1..inputStringsQnt) {
            val generator = readStrGenerator()
            generators.add(generator)
        }
        //output
        for (i in 1..inputStringsQnt) {
            println(generators[i-1].generate())
        }
    }
}

/**
 * Генератор строки длины N, состоящей из строчных латинских букв (кол-во разных букв К)
 * Каждая из используемых букв обладает минимальной частотой повторения в итоговой строке
 * @property strLengthN длина итоговой строки N
 * @property lettersQntK кол-во разных букв К
 */
class StringGenerator(val strLengthN: Int, val lettersQntK: Int) {

    /** Генерировать строку с минимальной частотой букв */
    fun generate(): String {
        // самый простой алгоритм: в повторяющемся цикле поочередно добавляем следующую букву, пока счетчик не просигналит о завершении
        val stringBuilder = StringBuilder(strLengthN)
        var counter = 0
        while (true) {
            for (i in 1..lettersQntK) {
                stringBuilder.append((i + 96).toChar())
                counter++
                if (counter == strLengthN) break
            }
            if (counter == strLengthN) break
        }
        return stringBuilder.toString()
    }

}