class ProblemA {

    /**
     *  Прыгающие лягушки
     */
    fun main() {
        val frogsCount = readInt()//Число лягушек

        var i = 0
        while (i < frogsCount) {
            val frogInstruction = readListLong() //Инструкции для лягушки - список из [a, b, k]
            println(frogPosition(frogInstruction[0], frogInstruction[1], frogInstruction[2]))
            i++
        }
    }

    /**
     * @param hopToRight смещение вправо по оси Ox
     * @param hopToLeft смещение влево по оси Ox
     * @param totalHops Общее число прыжков
     */
    private fun frogPosition(hopToRight: Long, hopToLeft: Long, totalHops: Long): Long {
        var position = 0L
        var hopsCount = 0L
        var odd = true
        while (hopsCount < totalHops) {
            if (odd) {
                position += hopToRight
            } else {
                position -= hopToLeft
            }
            hopsCount++
            odd = !odd
        }
        return position
    }

}