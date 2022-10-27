class ProblemA {
    fun main() {
        val t = readInt()
        repeat(t) {
            var x: Long = 0
            val array = readLongArray(3)
            val a: Long = array[0]
            val b = array[1]
            val k: Long = array[2]

            val isAEven: Boolean = k.rem(2).toInt() == 0

            repeat(k.div(2).toInt()) {
                x += a
                x -= b
            }
            if (!isAEven)
                x += a

            println(x)
        }
    }
}
