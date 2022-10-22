import java.io.InputStream

class ProblemA {
    fun main() {
        //ваша реализация в методе main
        val inputStream: InputStream = this::class.java.getResource("problemA/input.txt")?.openStream() ?: throw Exception("No input file")
        System.setIn(inputStream)

        val queries = readInt()
        //println("queries = $queries")

        for (i in 1..queries) {
            val query = readLongArray(3)
            //println("query = $i: rightLength = $query[0]; leftLength = $query[1]; quantity = $query[2]")

            println(locate(query[0], query[1], query[2]))
        }
    }

    private fun locate(rightLength: Long, leftLength: Long, quantity: Long): Long {
        var result: Long = 0

        for (i in 1..quantity) {
            if (i % 2 == 1L)
                result += rightLength
            else
                result -= leftLength
        }
        return result
    }

}