class ProblemD {

  fun main() {
    val t = readInt()
    for (i in 0 until t) {
      val n = readInt()
      val a = readListLong()
      val answer = a.sortedDescending().foldIndexed(0L) { index, max, value ->
        val curr = (index + 1) * value
        maxOf(max, curr)
      }
      println(answer)
    }
  }
}