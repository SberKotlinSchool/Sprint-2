class ProblemA {

    fun main() {

        val requests = readInt()
        for (i:Int in 1..requests) {
            val abk = readLongArray(3)
            val a = abk[0]
            val b = abk[1]
            val k : Long = abk[2]
            val res = (a - b) * (k / 2) + a * (k and 0b1)
            println(res)
        }

    }

}