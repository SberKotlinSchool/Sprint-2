import kotlin.math.max

class ProblemD {

    fun main() {

        val t = readInt()
        for(i in 1 .. t) {
            val n = readInt()   // количества студентов
            val a = readln().split(' ').map(String::toLong).sorted()

            var profit = 0L
            for (j in 0 .. (n - 1))
                profit = max(a[j] * (a.size - j), profit)

            println(profit)
        }
    }

}