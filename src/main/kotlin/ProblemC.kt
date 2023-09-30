class ProblemC {

  fun main() {
    val n = readInt()
    val answer = readListInt().sortedDescending()
      .windowed(size = 2, step = 2)
      .fold(0) { acc, (a, b) -> acc + a - b }
    println(answer)
  }
}