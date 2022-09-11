class ProblemB {
    fun main() {
        var t = readInt()
    while(t > 0) {
        val stringL = readLongArray(2)
        var n = stringL[0]
        var k = stringL[1]
        var resultString = ""
        for (pos in 0 until n) {
            resultString += Char(97 + (pos % k))
        }
        t = t - 1
        println(resultString)
    }
    }
}
