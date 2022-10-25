import java.io.File

class ProblemA {

    fun main() {
        //ваша реализация в методе main
       val count = readInt()
        for (i in 1..count){
            val params = readLongArray(3)
            println(frogPosition(params[0], params[1], params[2]).toString())
        }
    }

    private fun frogPosition(a: Long, b: Long, k: Long): Long {
        val pairCount: Long = k / 2;
        val remainder: Long = k % 2;
        return (a - b) * pairCount + a * remainder;
    }

}