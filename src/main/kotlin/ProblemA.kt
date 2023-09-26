import java.io.BufferedReader
import java.io.File

class ProblemA {
    fun main() {
        val allTextList = File ("src/main/resources/problem${this::class.java.simpleName.last()}/input.txt").bufferedReader().use(BufferedReader::readText).split("\r?\n|\r".toRegex()).toMutableList()
        allTextList.removeAt(0)
        allTextList.map { string -> string.split(" ".toRegex()).toMutableList() }.map { mass -> mass.map { it.toLong() }.let { println(0-((it[2]/2)*it[1])+(it[0]*(it[2]-it[2]/2))) } }
    }
}