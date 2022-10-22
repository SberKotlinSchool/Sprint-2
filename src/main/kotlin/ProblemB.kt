import java.io.InputStream

class ProblemB {

    fun main() {

        //ваша реализация в методе main
        //output на тестовый input может быть различным!

        val inputStream: InputStream = this::class.java.getResource("problemB/input.txt")?.openStream() ?: throw Exception("No input file")
        System.setIn(inputStream)

        val queries = readInt()
        //println("queries = $queries")

        for (i in 1..queries) {
            val query = readIntArray(2)
            //println("query = $i: length = ${query[0]}; quantity = ${query[1]};")
            println(getString(query[0], query[1]))
        }
    }

    private fun getString(length: Int, quantity: Int): String {
        val characters = 'a'.rangeTo('z')
        val maxFreq = length / quantity
        val remainder = length % quantity
        val result = StringBuilder()

        for (i in 1..maxFreq) {
            result.append(characters.filterIndexed { index, _ -> index < quantity }.toCharArray())
        }
        result.append(characters.filterIndexed { index, _ -> index < remainder }.toCharArray())

        return result.toString()
    }

}