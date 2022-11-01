class ProblemD {

    fun main() {
        val t = readInt()
//        val list: ArrayList<IntArray> = ArrayList(t)
        repeat(t) {
            val n = readInt()
            val array = readLongArray(n)
//            list.add(array)
            array.sortDescending()
            var maxSum = array[0]
            for (i in 1 until array.size) {
                val sum = array[i] * (i+1)
                maxSum = if (sum > maxSum) sum else maxSum
            }
            println(maxSum)
        }
    }

}