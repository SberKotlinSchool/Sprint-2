class ProblemA {

    fun main() {
        val t = readInt()
        for (i in 1..t) {
            val list = readLongArray(3)
            println(list[0] * (list[2]/2 + list[2] % 2) - list[1] * (list[2] / 2))
        }
    }
}