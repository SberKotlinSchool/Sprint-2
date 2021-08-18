class ProblemB {

    fun main() {
        var requests: Int = readInt()
        while (requests-- > 0) {
            val params: List<Int> = readListInt()
            val targetStringLength: Int = params[0]
            val charactersNumber: Int = params[1]

            val minimalOccurrences = targetStringLength / charactersNumber

            var targetString = ""
            // Добавляем минимальное допустимое количество символов в строку
            for (i in 0 until charactersNumber) {
                targetString += "${'a'.plus(i % charactersNumber)}".repeat(minimalOccurrences)
            }

            // Добиваем строку до нужной длины символами по кругу
            for (i in targetString.length until targetStringLength) {
                targetString += 'a'.plus(i % charactersNumber);
            }

            println(targetString)
        }
    }

}