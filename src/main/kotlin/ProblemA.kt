class ProblemA {

  fun main() {
    val t = readInt()
    for (i in 0 until t) {
      val (a, b, k) = readListLong()
      var answer = 0L
      for (j in 0 until k) {
        if (j % 2 == 0L) {
          answer += a
        } else {
          answer -= b
        }
      }
      println(answer)
    }
  }
}