import kotlin.math.abs

class ProblemC {

    fun main() {
        val n = readInt()
        val inputArray = readIntArray(n)
        println(getResult(n, inputArray))
    }

    private fun getResult(n: Int, inputArray: IntArray): Int {
        val resultArray = Array(n) { 0 }

        for (i in 0 until n) {
            if (inputArray[i] == 0) continue

            var minValue = Int.MAX_VALUE
            var minIndex = 0

            for (j in i + 1 until n) {
                if (inputArray[j] == 0) continue

                val dt = abs(inputArray[i] - inputArray[j])
                if (dt < minValue) {
                    minValue = dt
                    minIndex = j
                }
            }
            resultArray[minIndex] = minValue
            inputArray[minIndex] = 0
        }
        return resultArray.sum()
    }
}