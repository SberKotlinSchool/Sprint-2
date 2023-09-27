class ProblemD {

    fun main() {
        //ваша реализация в методе main
        repeat(readInt()) {
            val clients = readLongArray(readInt()).sortedDescending()
            val result = clients.mapIndexed { index, client ->
                client * (index + 1)
            }.maxOrNull() ?: 0

            println(result)
        }
    }

}