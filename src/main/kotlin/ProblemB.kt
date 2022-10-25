class ProblemB {

    fun main() {
        val numOfWords = readInt()
        val wordsData = Array(numOfWords) {IntArray(2)}

        for(i in 0 until numOfWords){
            wordsData[i] = readIntArray(2)
        }

        for (i in 0 until numOfWords){
            println(getMagicWord(wordsData[i][0], wordsData[i][1]))
        }

    }

    fun getMagicWord (length: Int, numOfLetters: Int): String{
        var magicWord = ""
        var iterator = 0
        while(iterator < length){
            val currentLetter: Char = 'a' + (iterator % numOfLetters)
            magicWord += currentLetter
            iterator++
        }
        return magicWord
    }

}