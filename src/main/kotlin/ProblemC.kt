import java.io.InputStream

class ProblemC {

    fun main() {

        //ваша реализация в методе main
        val inputStream: InputStream = this::class.java.getResource("problemC/input.txt")?.openStream() ?: throw Exception("No input file")
        System.setIn(inputStream)

        val students = readInt()
        val skills: IntArray = readIntArray(students)
        println(getTasks(skills))
    }

    private fun getTasks(skills: IntArray): Int {
        var result = 0

        skills.sort()

        for (i in skills.size - 1 downTo 1 step 2) {
            //println("skills[$i] (${skills[i]}) - skills[${i-1}] (${skills[i-1]}) = " + (skills[i] - skills[i - 1]))
            result += (skills[i] - skills[i - 1])
        }
        return result
    }

}