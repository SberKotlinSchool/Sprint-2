import java.util.Collections.max
import kotlin.streams.toList

class ProblemD {

    fun main() {

        //ваша реализация в методе main
        val countRequests = readLong()
        for (i in 1..countRequests) {
            getBurgerStonks()
        }
    }

    private fun getBurgerStonks() {

        readLong()
        val moneyCustomers = readListLong()
        val listOfStonks = emptyList<Long>().toMutableList()
        val listOfValue = moneyCustomers.stream().distinct().toList()

        for (value in listOfValue){
            listOfStonks.add(moneyCustomers.count { x -> x >= value } * value)
        }

        println(max(listOfStonks))
    }
}