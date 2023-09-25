class ProblemA {

  fun main() {
    var i = readInt()
    while (i > 0)
      readListLong().let {
        val data = Triple(it[0], it[1], it[2])
        var x = 0L
        for (j in 0 until data.third)
          if ((j % 2).toInt() == 0) x += data.first else x -= data.second
        println(x)
        i--
      }
  }
}