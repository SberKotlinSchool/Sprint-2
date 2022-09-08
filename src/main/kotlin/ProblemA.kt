
class ProblemA {

    fun main() {
        val t = readInt()
        for(i in 1..t) {
            val abk = readLongArray(3)
            val sum = (abk[0] - abk[1]) * (abk[2]/2)
            if (abk[2] % 2 == 0L) {
                println(sum)
            } else  {
                println(sum + abk[0])
            }
        }
    }

}