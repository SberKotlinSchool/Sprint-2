class ProblemB {

    fun main() {
        val firstChar = 97  // код Буквы a
        val t = readInt()

        for (i in 1 .. t) {
            val arr = readln().split(' ').map(String::toInt)
            val n = arr[0]  // длина строки
            val k = arr[1]  // количество уникальных букв в строке

            var result = ""
            for (charIndex in 0 .. (n - 1))
                result += (firstChar + (charIndex % k)).toChar()

            println(result)
        }
    }

}