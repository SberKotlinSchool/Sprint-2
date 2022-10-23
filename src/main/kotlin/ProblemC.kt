class ProblemC {

    fun main() {
        val ignored = readInt() // на самом деле не нужна
        val ratingsList = readListInt().sorted()
        var tasksToDo = 0
        for (i in ratingsList.indices step 2) {
            tasksToDo += ratingsList[i+1] - ratingsList[i]
        }
        println(tasksToDo)
    }

}