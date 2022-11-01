import problemA.Jump
import java.lang.RuntimeException

class ProblemA {

    fun main() {
        val arrayJump = read()
        val intArray = count(arrayJump)
        write(intArray)
    }

    private fun read(): Array<Jump?> {
        val t = readInt()
        if (t !in 1..1000) {
            throw RuntimeException("Ошибка ввода числа кол-ва запросов, цифра должна быть от 1 до 1000")
        }
        val inputArray = arrayOfNulls<Jump>(t)
        for (i in inputArray.indices){
            val intList = readListInt()
            if (intList.size == 3) {
                inputArray[i] = Jump(intList[0], intList[1], intList[2])
            }
        }
        return inputArray
    }

    private fun write(longArray: LongArray) {
        for (t in longArray.indices)
        {
            println(longArray[t])
        }
    }

    private fun count(arrayJump: Array<Jump?>): LongArray {
        val longArray = LongArray(arrayJump.size)
        for (i in arrayJump.indices) {
            val jump = arrayJump[i]
            if (jump != null) {
                var x = 0L
                val a = jump.a
                val b = jump.b
               for (k in 1..jump.k) {
                   x = if (k.isOdd()) {
                       x + a
                   } else {
                       x - b
                   }
               }
                longArray[i] = x
            }
        }
        return longArray
    }

    private fun Int.isEven() = this % 2 == 0 //чет
    private fun Int.isOdd() = this % 2 == 1 //нечет
}