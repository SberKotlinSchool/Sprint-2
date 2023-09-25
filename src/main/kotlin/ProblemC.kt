class ProblemC {

    fun main() {

        val count = readInt() / 2

        val prog = readListLong().sorted()
        var j : Long = 0L
        for ( i in 1 .. count ){

            j += prog[ i * 2 - 1 ] - prog[ i * 2 - 2]

        }

        println(j)

        }

    }