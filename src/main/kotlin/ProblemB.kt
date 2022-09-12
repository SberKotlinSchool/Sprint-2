class ProblemB {
    fun main() {
        var t = readInt()
    while(t > 0) {
        val stringL : IntArray = readIntArray (2)
        var n = stringL[0]
        var k = stringL[1]
        var resultString = ""
        for (pos : Int in 0 until n) {
            resultString += Char(97 + (pos % k))
        }
        t = t - 1
        println(resultString)
    }
    }
}
