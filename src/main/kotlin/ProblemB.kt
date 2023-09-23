class ProblemB {

    private val alphabet = ('a'..'z').toList()

    fun main() {
        //ваша реализация в методе main
        //output на тестовый input может быть различным!
        val t = readInt()
        for (i in 1..t) {
            val params = readListInt()
            println(uniformString(params[0], params[1]))
        }
    }

    private fun uniformString(n: Int, k: Int): String {
        val alphabetSublist = alphabet.subList(0, k)
        return (0 until n).fold(StringBuilder()) { s, i -> s.append(alphabetSublist[i % k]) }.toString()

    }

}