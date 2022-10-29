class ProblemA {

    fun main() {
        val t = readInt()
        repeat(t)
        {
            var posX = 0L
            val (a, b, k) = readLongArray(3)
            posX = if (k.mod(2)==1)
                (a - b) * (k / 2L) + a
            else (a - b) * (k / 2L)
            println(posX)
        }
    }
}