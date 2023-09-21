class ProblemB {

    /**
     *  Равномерная строка
     */
    fun main() {

        val dict = "abcdefghijklmnopqrstuvwxyz"//Справочник

        val taskCount = readInt()//Количество заданий

        var taskNum = 0
        while (taskNum < taskCount) {
            val task = readListInt() //[n, k]
            println(generateWord(task[0], task[1], dict))

            taskNum++
        }
    }

    /**
     * @param wordLength Длина создаваемого слова
     * @param dictSymbolsCount Число используемых символов справочника
     * @param dict Справочник символов
     * @return Строка заданной длины, сформированная из первых k-символов справочника
     */
    private fun generateWord(wordLength: Int, dictSymbolsCount: Int, dict: String): String {
        var j = 0
        val part = dict.substring(0, dictSymbolsCount)
        var resultWord = ""
        while (j < wordLength) {
            resultWord += part;
            j += part.length
        }
        if (resultWord.length > wordLength) {
            resultWord = resultWord.substring(0, wordLength)
        }
        return resultWord
    }

}