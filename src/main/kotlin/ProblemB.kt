class ProblemB {
    fun main() {
        val requests = readInt()
        val alphabet = "abcdefghijklmnopqrstuvwxyz"

        for (i in 0 until requests) {
            val intArr = readIntArray(2)
            val resString = StringBuilder()

            while (resString.length < intArr[0]) {
                resString.append(alphabet.substring(0, intArr[1]))
            }
            println(resString.substring(0, intArr[0]))
        }
    }
}