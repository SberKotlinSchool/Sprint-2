import java.io.InputStream

class ProblemA {
    private fun getPosition(rightJumpLength: Int, leftJumpLength: Int, jumpsAmount: Int) {
        var position = 0L
        for (jump in 1..jumpsAmount) {
            when (jump % 2) {
                1 -> position += rightJumpLength
                0 -> position -= leftJumpLength
            }
        }
        println(position)
    }

    fun main() {
        val inputStream: InputStream = this::class.java.getResource("problemA/input.txt").openStream()
        System.setIn(inputStream)

        val queryAmount = readInt()
        for (i in 1..queryAmount) {
            val queryParams = readIntArray(3)
            getPosition(queryParams[0], queryParams[1], queryParams[2])
        }
    }
}