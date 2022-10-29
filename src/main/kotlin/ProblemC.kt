import kotlin.math.abs

class ProblemC {
    fun main() {
        val students = readInt()

        readIntArray(students).let {
            val middle = it.size / 2
            var a = 0
            var b = 0

            for (i in 0 until students) {
                when (i) {
                    in 0 until middle -> a += it[i]
                    in middle until it.size -> b += it[i]
                }
            }
            println(abs(a - b))
        }
    }
}
