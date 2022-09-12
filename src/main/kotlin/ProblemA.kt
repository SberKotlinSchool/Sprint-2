class ProblemA {
    fun main() {
        //ваша реализация в методе main
        var t = readInt()
        while (t > 0) {
            val stringL = readLongArray(3)
            val a = stringL[0]
            val b = stringL[1]
            var k = stringL[2]
            var x : Long = 0
            while (k > 0) {
                if (k%2 != 0L){
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
