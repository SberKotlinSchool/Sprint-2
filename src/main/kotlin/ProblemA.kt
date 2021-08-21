class ProblemA {

    fun main() {

        var entryAmount: Byte = readln().toByte() // 1 <= количество запросов <= 100
        val outputArray = ArrayList<Long>()

        while (entryAmount-- > 0) {
            val (evenJumpInc, oddJumpInc, jumpAmount) = readLine()!!.trim().split("\\s+".toRegex()).map(String::toLong)
            val xCoordinate: Long = (evenJumpInc - oddJumpInc) * (jumpAmount / 2) + (jumpAmount % 2) * evenJumpInc
            outputArray.add(xCoordinate)
        }
        for (el in outputArray) {
            println(el.toString())
        }
    }

}
