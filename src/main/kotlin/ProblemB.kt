class ProblemB {
    fun main() {
        var t = readInt()
    while(t > 0) {
        var n = readInt()
        var k = readInt()
        var resultString = ""
        for (pos in 0 until n) {
            resultString += Char(97 + (pos % k))
        }
        t = t - 1
        println(resultString)
    }
    }
}