class ProblemB {

    fun main() {

        readInputProblemB().forEach { inputItem ->
            val alphabet = ALPHABET.substring(0, inputItem.alphabetLength)
            var result = ""
            repeat(inputItem.totalLength) {i ->
                result = result.plus(alphabet[i % alphabet.length])
            }
            println(result)
        }

    }

}

private const val ALPHABET = "abcdefghijklmnopqrstuvwxyz"

private fun readInputProblemB(): List<InputItemProblemB> {
    val input: MutableList<InputItemProblemB> = mutableListOf()
    repeat(readLine()!!.toInt()) {
        val inputArr = readLine()!!.split(" ")
        input.add(
            InputItemProblemB(
                totalLength = inputArr[0].toInt(),
                alphabetLength = inputArr[1].toInt()
            )
        )
    }
    return input
}

private class InputItemProblemB(
    val totalLength: Int,
    val alphabetLength: Int
)