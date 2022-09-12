class ProblemB {
    fun main() {
        var t = readInt()
    while(t > 0) {
        val stringL = readLongArray(2)
        var n = stringL[0]
        var k = stringL[1]
        var k1 = k.toLong()
        var pos1 = pos.toLong()
        var resultString = ""
        for (pos in 0 until n) {
            resultString += Char(97 + (pos1 % k1))
        }
        t = t - 1
        println(resultString)
    }
    }
}
