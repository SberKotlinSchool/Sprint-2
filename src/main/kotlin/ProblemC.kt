class ProblemC {
    fun main() {
        //ваша реализация в методе main
            val n = readInt()
            val a = readListInt()
            val aSorted = a.sorted()
        var needTask : Long = 0
            for (index in aSorted.indices step 2) {
                val firstIndex = aSorted[index]
                val secondIndex = aSorted[index + 1]
                needTask += secondIndex - firstIndex
            }
        println(needTask)
    }
}