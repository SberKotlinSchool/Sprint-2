class ProblemB {

    fun main() {
        val alphabet = ('a'..'z').toList()

        val t = readInt()
        repeat(t) {
            val array = readIntArray(2)
            val n = array[0]
            val k = array[1]

            val builder = StringBuilder()
            while (builder.count() < n) {
                for (i in 0..k - 1) {
                    if (builder.count() < n) {
                        builder.append(alphabet[i])
                    }
                }
            }
            println(builder.toString())
        }
    }
}
