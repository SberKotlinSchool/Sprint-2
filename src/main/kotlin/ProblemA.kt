class ProblemA {

    fun main() {
        val inputStringsQnt = readInt()
        val frogsJumps = ArrayList<FrogJumps>(inputStringsQnt)
        //input
        for (i in 1..inputStringsQnt) {
            val frog = readFrogJumps()
            frogsJumps.add(frog)
        }
        //output
        for (i in 1..inputStringsQnt) {
            println(frogsJumps[i-1].calculate())
        }
    }
}

/**
 * Калькулятор итоговой координаты после прыжков лягушки.
 * Лягушка прыгает сначала вправо на +A, потом влево на -B всего K раз
 * @property rightStepA расстояние прыжка вправо +А
 * @property leftStepB расстояние прыжка влево -В
 * @property stepsQntK кол-во прыжков К
 */
class FrogJumps(val rightStepA: Long, val leftStepB: Long, val stepsQntK: Int) {

    /** Вычислить итоговые координаты */
    fun calculate(): Long {
        return if (stepsQntK%2 == 0) {
            (rightStepA-leftStepB)*(stepsQntK/2)
        } else {
            rightStepA*((stepsQntK/2)+1) - leftStepB*(stepsQntK/2)
        }
    }
}