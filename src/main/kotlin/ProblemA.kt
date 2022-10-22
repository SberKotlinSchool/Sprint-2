private const val SIZE = 3
private const val STEPS_TO_THE_RIGHT_INDEX = 0
private const val STEPS_TO_THE_LEFT_INDEX = 1

class ProblemA {
    fun main() {
        val count = readInt()

        for (line in 1..count) {
            val jumps = readLongArray(SIZE)
            var position = 0L
            for (jump in 1..jumps[SIZE - 1]) {
                if (jump % 2 == 1L) {
                    position = position.plus(jumps[STEPS_TO_THE_RIGHT_INDEX])
                } else {
                    position = position.minus(jumps[STEPS_TO_THE_LEFT_INDEX])
                }
            }
            when (line) {
                count -> print(position)
                else -> print("$position" + "\n")
            }
        }
    }
}
