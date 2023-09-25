class ProblemB {

    fun main() {

        val alphabet = ( 'a' .. 'z' ).toList()

        val count = readInt()

        repeat(count) { readListInt().let {

            var i : Int = 0
            var stringOut = StringBuilder( )

            for ( j in 0.. it[0] - 1 ) {
                if ( j % it[1].toInt() == 0 ) i = 0

                stringOut.append(alphabet[i])
                ++i }
            println(stringOut)
        }

        }

    }

}