import java.lang.Integer.min

class ProblemB {

    fun main() {
        //ваша реализация в методе main
        //output на тестовый input может быть различным!
        val lines = readInt()
        for (i in 1..lines) {
            val request = readListInt()
            val length = request.get(0)
            val maxChar = request.get(1)
            println(getLine(length, maxChar));
        }
    }

    fun getLine(length: Int, maxChar: Int): String {
        var result = "";
        for (i in 0..min(length, maxChar) - 1) {
            result += 'a' + i;
        }
        val resultLength = result.length;
        if (resultLength < length) {
            result += getLine(length - resultLength, maxChar);
        }
        return result;
    }

}