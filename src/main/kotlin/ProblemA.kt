class ProblemA {

    fun main() {
        //ваша реализация в методе main
        //println("Введите количество лягушек для наблюдения")
        val frogCount: Int = readInt()

        repeat(frogCount) {
            //println("Введите 3 числа через пробел. Правый прыжок, левый прыжок, кол-во прыжков")
            val frogMovementArray = readLongArray(3)
            val rightJump = frogMovementArray[0]
            val leftJump = frogMovementArray[1]
            val jumpCnt = frogMovementArray[2]

            var currentPos: Long = 0
            for (jump in 0 until jumpCnt.toInt()) {

                if (jump % 2 == 0) {
                    currentPos += rightJump
                } else {
                    currentPos -= leftJump
                }
            }
            println(currentPos)
        }

    }
}