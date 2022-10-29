class ProblemB {

    fun main() {
        val t = readInt()
        repeat(t)
        {
            val simbolArray = arrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
            val (n, k) = readIntArray(2)
            var s = ""
            while (s.length < n) {
                val freqArray = IntArray(k)
                for (i in 1..k) {
                    freqArray[i-1] = s.toCharArray().filter { it == simbolArray[i-1] }.size
                }
                val minIndex = freqArray.indexOf(freqArray.minOrNull()!!)
                s+=simbolArray[minIndex]
            }
            println(s)
        }

    }

}