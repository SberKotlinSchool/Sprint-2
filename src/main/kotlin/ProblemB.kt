class ProblemB {

    val alphabets = "abcdefghijklmnopqrstuvwxyz"

    fun main() {

        //ваша реализация в методе main
        //output на тестовый input может быть различным!

        val countString = readInt()

        val result = mutableListOf<String>()

        for (i in 1..countString) {
            val stringData = readIntArray(2)
            val stringLength = stringData[0]
            val numberDifferentLetters = stringData[1]

            if (numberDifferentLetters > stringLength) throw Exception("Количество букв больше чем длинна строки")
            else if (numberDifferentLetters == alphabets.length)
                result.add(alphabets.padEnd(stringLength, 'a'))
            else {
                val stringEnd = alphabets
                    .substringBefore(alphabets[numberDifferentLetters])
                    .padEnd(stringLength, 'a')
                result.add(stringEnd)
            }
        }
        result.forEach { i -> println(i) }
    }
}