class ProblemA {

    fun main() {
        //ваша реализация в методе main
        val requestCount = readInt()
        if (requestCount >= 1 || requestCount <= 1000) {
            for (i in 1..requestCount) {
                val params: LongArray = readLongArray(3)
                println(
                    currentPosition(
                        jumpLengthRight = params[0],
                        jumpLengthLeft = params[1],
                        countJumps = params[2]
                    )
                )
            }
        } else {
            println("Введено неверное количество запросов!")
        }
    }

    private fun currentPosition(jumpLengthRight: Long, jumpLengthLeft: Long, countJumps: Long): Long {
        var position = 0L
        for (i in 1..countJumps) {
            if (i % 2 == 1L) {
                position += jumpLengthRight
            } else {
                position -= jumpLengthLeft
            }
        }
        return position
    }

}