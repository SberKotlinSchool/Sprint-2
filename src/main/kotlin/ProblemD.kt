class ProblemD {

    fun main() {

        //ваша реализация в методе main
        for (caseCounter in 1..readInt()) {
            println(readLongArray(readInt()).sortedArrayDescending().withIndex().maxOf { (it.index + 1) * it.value })
        }
    }

}