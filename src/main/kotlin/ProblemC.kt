import kotlin.math.ceil

class ProblemC {

    fun main() {

        //ваша реализация в методе main
        val countRequests = readLong()
        val listOfTask = readListLong().sorted()
        println(ceil((
                listOfTask[(countRequests/ 2 - 1).toInt()]
                +  listOfTask[(countRequests/ 2).toInt()]
                )/ 2.0)
            .toInt())
    }

}