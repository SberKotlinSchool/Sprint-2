class ProblemA {

    fun main() {
        repeat(readInt()) {
            println(startJumping(readListLong()))
        }
    }

    private fun startJumping(params: List<Long>): Long {
        val (right, left, c) = params
        if (left == right) {
            return if (c % 2L == 0L) 0 else right
        }
        var pos = 0L
        (0 until c).forEach {
            pos += if (it % 2L == 0L) right else (left * -1)
        }
        return pos
    }
}
