import java.io.BufferedReader
import java.io.File

class ProblemB {

    fun main() {
        val allTextList = File ("src/main/resources/problem${this::class.java.simpleName.last()}/input.txt").bufferedReader().use(BufferedReader::readText).split("\r?\n|\r".toRegex()).toMutableList()
        allTextList.removeAt(0)
        allTextList.map { string -> string.split(" ".toRegex()).toMutableList() }.map { mass ->
            mass.map { it.toInt() }.let {
                for (i in 0..it[0]-1) {
                    print(Char('a'.code + i % it[1]))
                }
                println()
            }
        }
    }
}