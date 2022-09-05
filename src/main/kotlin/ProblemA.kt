class ProblemA {

    fun main() {
        //ваша реализация в методе main

        val countFrog = readInt()

        val result = mutableListOf<Long>()

        for (i in 1..countFrog) {
            val readIntArray = readLongArray(3)
            val integer = readIntArray[2] / 2
            val modulo = readIntArray[2] % 2
            val a = readIntArray[0]
            val b = readIntArray[1]

            result.add(a * integer + a * modulo - b * integer)
        }
        result.forEach { i -> println(i) }
    }
}