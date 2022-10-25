class ProblemB {

    fun main() {

        //ваша реализация в методе main
        //output на тестовый input может быть различным!
        val inputStream = this::class.java.getResource("problemB/input.txt")!!.openStream()
        System.setIn(inputStream)

        val abc = CharArray(26) { 'a'.plus(it) }

        Array(readInt()) { readIntArray(2) }.forEach {
            println(String(CharArray(it[0]) { char -> abc[char % it[1]] }))
        }
    }
}