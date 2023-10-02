class ProblemB {

    fun main() {
        val stringCount = readInt()
        for (i in 1..stringCount){
            val stringParams = readListInt()
            val stringLength = stringParams[0]
            val letterCount = stringParams[1]
            var result = ""
            for (j in 0 until stringLength){
                result += 'a' + j % letterCount
            }
            println(result)
        }

        //ваша реализация в методе main
        //output на тестовый input может быть различным!

    }

}