import java.io.BufferedReader
import java.io.File

class ProblemC {

    fun main() {
        val allTextList = File ("src/main/resources/problem${this::class.java.simpleName.last()}/input.txt").bufferedReader().use(
            BufferedReader::readText
        ).split("\r?\n|\r".toRegex()).toMutableList()
        allTextList.removeAt(0)
        allTextList.map { string -> string.split(" ".toRegex()) }.map { mass ->
            mass.map { it.toInt() }
                .let {
                    val sortedList = it.sorted()
                    var sum = 0
                    for (i in 0 until it.size - 1 step 2) {
                        sum += sortedList[i + 1] - sortedList[i]
                    }
                    println(sum)
                }
        }
    }

}