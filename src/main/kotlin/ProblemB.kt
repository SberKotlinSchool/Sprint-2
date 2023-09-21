import kotlin.random.Random

class ProblemB {
    val abc = "abcdefghijklmnopqrstuvwxyz"
    fun main() {
        val inputStream = this::class.java.getResource("problemB/input.txt")!!.openStream()
        System.setIn(inputStream)
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

fun main() {
    ProblemB().main()
}