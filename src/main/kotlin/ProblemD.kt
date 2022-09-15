import kotlin.math.max

class ProblemD {

    fun main() {
        val requests = readInt()

        for (i in 0 until requests) {
            // skip money  count
            readInt()

            val money = readStrings().map { it.toLong() }.sorted()

            var result = 0L
            for (k in money.indices) {
                val sublist = money.subList(k, money.size)

                result = max(
                    result,
                    sublist.first() * sublist.size
                )
            }

            println(result)
        }
    }

}