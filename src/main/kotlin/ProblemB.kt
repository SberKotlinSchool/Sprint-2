class ProblemB {

  fun main() {
    var i = readInt()
    while (i > 0)
      readListInt().let {
        val data = Pair(it[0], it[1])
        val alphabets = ('a'..'z').take(data.second).joinToString("")
        var answer = ""
        while (answer.length < data.first)
          answer += alphabets
        println(answer.dropLast(answer.length - data.first))
        i--
      }
  }

}