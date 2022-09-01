class ProblemD {

    fun main() {

        //ваша реализация в методе main
        val countRequest = readInt()
        for (i in 1..countRequest) {
            val countClients = readInt()
            val amounts = readLongArray(countClients)

            var result = 0L
            amounts.sort()
            for ((index, item) in amounts.withIndex()) {
                val sum = item * (amounts.size - index)
                if (result <= sum) result = sum
            }
            println(result)
        }

    }

}