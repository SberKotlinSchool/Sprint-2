
class ProblemC {
    fun main() {
        val count = readInt()
        val request: IntArray = readIntArray(count)
        request.sort()
        var a: Int
        var b: Int
        var c = 0
        for (i in 0..count - 2 step 2) {
            a = request[i]
            b = request[i + 1]
            while (a != b) {
                if (a < b) {
                    a++
                    c++
                } else {
                    b++
                    c++
                }
            }
        }
        println(c)
    }
}