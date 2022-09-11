class ProblemA {
    fun main() {
        //ваша реализация в методе main
        var t = readInt()
        while (t > 0) {
            val a = readInt()
            val b = readInt()
            var k = readInt()
            var x : Long = 0
            while (k > 0) {
                if (k%2 != 0){
                    x = x + a
                }
                else {
                    x = x - b
                }
                k = k - 1
            }
            t = t - 1
            println(x)
        }
    }
}