class ProblemD {

    fun main() {
        for (i in 1..readInt()) {
            val inputArray = readLongArray(readInt())
            println(getResult(inputArray))
        }
    }

    private fun getResult(inputArray: LongArray): Long {
        if (inputArray.size == 1) return inputArray[0]

        var result = 0L
        val inputSet = inputArray.toSet()

        for (m in inputSet) {
            var sum = 0L
            for (current in inputArray) {
                if (current >= m) sum += m
            }
            if (sum > result) result = sum
        }
        return result
    }

}