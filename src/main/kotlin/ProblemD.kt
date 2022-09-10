class ProblemD {

    fun main() {

       val rqNum = readInt()

        for (i in 0 until rqNum) {
            val clientNum = readInt()
            val cashArray = readLongArray(clientNum)
            var ans = cashArray[0]

            cashArray.sort()
            var pivot = clientNum - 1

            while (pivot > 0) {
                val rightSum = cashArray[pivot] * (clientNum - pivot)
                val leftSum = cashArray[pivot - 1] * (clientNum - pivot + 1)
                if (leftSum < rightSum) {
                    ans = rightSum
                    break
                }
                pivot -= 1
                if (pivot == 0) {
                    ans = cashArray[0] * clientNum
                    break
                }
            }
            println(ans)
        }

    }

}