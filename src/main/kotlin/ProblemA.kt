class ProblemA {

    fun main() {

        val t = readInt()

        for (i in 1..t) {

            val info = readListLong()

            var x : Long = 0
            val a = info[0]
            val b = info[1]
            val k = info[2]

            for (j in 1..k) {
                x += if (j % 2L != 0L) {
                    +a
                } else {
                    -b
                }
            }
            println(x)
        }
    }
}