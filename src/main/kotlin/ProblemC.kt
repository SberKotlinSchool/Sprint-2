class ProblemC {

    fun main() {
        //ваша реализация в методе main

        val listtolist = input_dir_in_list(workdir = "problemC")// input.txt
        val sortedList = listtolist.get(0).sortedWith(compareBy({ it.toInt() }))
        val outputlist = sortedList.withIndex().groupBy { it.index / 2 }.map { it.value.map { it.value } }
        var result: Int = 0
        for (lists in outputlist) {
            result += (lists.get(1).toInt() - lists.get(0).toInt())
        }
        println(result)
    }

}

fun main(args: Array<String>) {
    ProblemC().main()
}