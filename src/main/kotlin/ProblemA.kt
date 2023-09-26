class ProblemA {
    fun main() {
         (1..readInt()).forEach {
            val (a, b, k) = readListLong()
            println(( k/2 + k%2 ) * a - k/2*b )
        }
    }
}