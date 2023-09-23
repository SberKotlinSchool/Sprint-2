class ProblemA {

    fun main() {
        val countRequest = readInt()
        repeat(countRequest) {
            val data = readListInt()
            var x = 0L;
            val a = data[0]
            val b = data[1]
            repeat(data[2]) {
                if (it % 2 == 0) x += a
                else x -= b
            }
            println(x)
        }
    }

}