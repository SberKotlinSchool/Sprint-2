class ProblemA {

    fun main() {
        readInputProblemA().forEach { inputItem ->
            var result: Long = 0
            result += (inputItem.jumpForwardLength - inputItem.jumpBackLength).toLong() * (inputItem.jumpsCount / 2)
            if (inputItem.jumpsCount % 2 == 1) {
                result += inputItem.jumpForwardLength
            }
            println(result)
        }
    }

}

private fun readInputProblemA(): List<InputItemProblemA> {
    val input: MutableList<InputItemProblemA> = mutableListOf()
    repeat(readLine()!!.toInt()) {
        val inputArr = readLine()!!.split(" ")
        input.add(
            InputItemProblemA(
                jumpForwardLength = inputArr[0].toInt(),
                jumpBackLength = inputArr[1].toInt(),
                jumpsCount = inputArr[2].toInt()
            )
        )
    }
    return input
}

private class InputItemProblemA(
    val jumpForwardLength: Int,
    val jumpBackLength: Int,
    val jumpsCount: Int
)