class ProblemA {

    /**
     * Прыгающая лягушка
     * count - количество лягушек
     * a - длина прыжка право
     * b - длина прыжка влево
     * k - общее количество прыжков
     * Вычисляет позицию лягушки после всех прыжков
     */
    fun main() {
        val count = readLong()

        for(i in 1 .. count) {
            val params = readln().split(' ').map(String::toLong)
            println(calcFrogPosition(params[0], params[1], params[2]))
        }
    }

    private fun calcFrogPosition(a:Long, b:Long, k:Long): Long {
        val k1 = k / 2
        val k2 = k % 2
        return k1 * a + k2 * a - b * k1
    }

}