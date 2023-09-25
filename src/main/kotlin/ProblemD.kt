class ProblemD {

  fun main() {
    var i = readInt()
    while (i > 0) {
      val clientsCount = readInt()
      val money = readLongArray(clientsCount).toList()
      println(money.maxOfOrNull { item ->
        val count = money.filter { it - item >= 0 }.size
        count * item
      })
      i--
    }
  }

}