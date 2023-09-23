import kotlin.math.abs

class ProblemC {

    fun main() {
        readInt()
        val data = readListInt().toMutableList()
        var countTasks = 0
        while (data.isNotEmpty()) {
            var minCountTask: Int? = null
            var secondStudentIndex = 0
            val tasksFirstStudent = data.first()
            data.removeFirst()

            data.forEachIndexed { index, value ->
                val difference = abs(tasksFirstStudent - value)
                minCountTask = minCountTask?.run {
                    if (this > difference ) {
                        secondStudentIndex = index
                        difference
                    }
                    else this
                } ?: difference
            }
            data.removeAt(secondStudentIndex)
            countTasks += minCountTask?:0
        }
        println(countTasks)

    }

}