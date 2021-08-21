class ProblemB {

    fun main() {
        var entryAmount: Int = readln().toInt()
        val outputArray = ArrayList<String>()

        while (entryAmount-- > 0) {
            var ansStr = ""
            val (strSize, letterNum) = readLine()!!.trim().split("\\s+".toRegex()).map(String::toInt)

            for (i in 0 until strSize) {
                ansStr += ('a' + i % letterNum)
            }
            outputArray.add(ansStr)
        }
        for (el in outputArray) {
            println(el)
        }
    }

}
