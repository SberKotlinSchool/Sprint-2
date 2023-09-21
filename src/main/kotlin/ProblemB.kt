import kotlin.random.Random

class ProblemB {
    val abc = "abcdefghijklmnopqrstuvwxyz"

    fun main() {
        var steps = readInt()
        while (steps-- > 0) {
            val line = readListInt().toMutableList()
            var string = ""
            while (line[0]-- > 0) {
                val letter = abc[Random.nextInt(line[1])]
                string += letter
            }
            println(string)
        }
    }
}