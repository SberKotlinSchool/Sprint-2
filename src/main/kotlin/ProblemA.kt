class ProblemA {

    fun main() {
        //ваша реализация в методе main
        val numberOfFrogs = readInt()
        for (i in 1..numberOfFrogs) {
            val inputData = readIntArray(3)
            println(frogPosition(inputData))
        }
    }

    private fun frogPosition(inputData: IntArray): Long {
        val rightJump: Long = inputData.get(0).toLong()
        val leftJump: Long = inputData.get(1).toLong()
        val numberOfJums: Int = inputData.get(2)
        var position: Long = 0

        for (i in 1..numberOfJums) {
            if (i % 2 == 1) {
                position += rightJump
            } else {
                position -= leftJump
            }
        }

        return position
    }

}

