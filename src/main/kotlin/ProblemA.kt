class ProblemA {

    fun main() {
        val cnt = readInt()
        repeat(cnt) {
            val arr = readLongArray(3)
            var position: Long = 0
            var left = true
            for (i in 1..arr[2]) {
                if (left) {
                    position += arr[0]
                } else {
                    position -= arr[1]
                }
                left = !left
            }
            println(position)
        }
    }
}