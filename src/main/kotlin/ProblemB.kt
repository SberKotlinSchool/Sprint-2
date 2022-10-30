class ProblemB {

    fun main() {
        val cnt = readInt()
        val alphabet = ('a'..'z').toList()
        repeat(cnt) {
            val arr = readIntArray(2)
            val string = StringBuilder()
            var i = 0
            repeat(arr[0]) {
                if (i == arr[1]) {
                    i = 0
                }
                string.append(alphabet[i])
                i++
            }
            println(string)
        }
    }

}