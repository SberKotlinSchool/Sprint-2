class ProblemD {

    fun main() {

        //ваша реализация в методе main
        val inputStream = this::class.java.getResource("problemD/input.txt")!!.openStream()
        System.setIn(inputStream)

        for (caseCounter in 1..readInt()) {
            println(readLongArray(readInt()).sortedArrayDescending().withIndex().maxOf { (it.index + 1) * it.value })
        }
    }

}