import kotlin.math.abs

class ProblemC {

  fun main() {
    val i = readInt()
    println(readIntArray(i)
      .toList()
      .sorted()
      .zipWithNext()
      .filterIndexed { index, _ -> index % 2 == 0 }
      .sumOf { abs(it.first - it.second) })
  }

}