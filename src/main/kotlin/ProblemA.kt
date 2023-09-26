class ProblemA {

  fun main() {
    var i = readInt()
    while (i > 0) {
      val data = readListLong()
      val a = (data[2] - 1) / 2 + 1
      println(a * data[0] - (data[2] - a) * data[1])
      i--
    }
  }
}