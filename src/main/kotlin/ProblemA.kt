class ProblemA {

    fun main() {

        //ваша реализация в методе main
        val inputStream = this::class.java.getResource("problemA/input.txt")!!.openStream()
        System.setIn(inputStream)

        Array(readInt()) { readLongArray(3) }.forEach {
            println((it[0] - it[1]) * (it[2] / 2) + it[0] * (it[2] % 2))
        }
    }
}