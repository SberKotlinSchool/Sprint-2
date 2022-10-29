import java.util.*

class ProblemD {

    fun main() {

        readArrayOfLongArraysOfVarLength(readInt()).forEach { clientsCoins ->
            val clients = clientsCoins.size
            Arrays.sort(clientsCoins)
            var result = 0L
            for (i in 0 until clients) {
                result = result.coerceAtLeast(clientsCoins[i] * (clients - i).toLong())
            }
            println(result)
        }


    }

}

fun main() {
    ProblemD().main()
}