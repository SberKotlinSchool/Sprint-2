class ProblemA {

    fun main() {

        //ваша реализация в методе main
        val frogs = readInt()
        for (i in 1..frogs) {
            val args: IntArray = readIntArray(3)
            println(frogPosition(args[0].toLong(), args[1].toLong(), args[2]))
        }
    }

    private fun frogPosition(firstJump: Long, secondJump: Long, jumps: Int): Long {

        var pos = 0L

        for (i in 1..jumps) {
            if (i % 2 == 1) {
                pos += firstJump
            } else {
                pos -= secondJump
            }
        }

        return pos
    }
}