class ProblemA {

    fun main() {
        repeat(readInt()) {
            val (a, b, k) = readListInt()
            val steps = k / 2
            // конвертируем в Long, только когда итоговое значение может вывалитсья за Int
            val position: Long = steps.toLong() * (a - b)
            val adjustment = if (k % 2 == 0) 0 else a

            println(position + adjustment)
        }
    }
}
