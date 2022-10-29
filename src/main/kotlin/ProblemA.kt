class ProblemA {

    fun main() {

        numOfFrogs().let { frogs ->
            List(frogs) {
                jumpParams()
            }.forEach { jump ->
                println(makeJumps(jump))
            }
        }

    }

    fun numOfFrogs() = readInt()

    fun jumpParams() = readLongArray(3).let { (a, b, k) -> FrogJumps(a, b, k) }

    fun makeJumps(frogJumps: FrogJumps): Long = frogJumps.let { (a, b, k) ->
        return (k / 2 + k % 2) * a - (k / 2 ) * b
    }

    data class FrogJumps(val a: Long, val b: Long, val k: Long)

}

fun main() {
    ProblemA().main()
}