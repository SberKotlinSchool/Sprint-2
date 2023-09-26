import java.io.BufferedReader
import java.io.File

class ProblemD {

    fun main() {
        val allTextList =
            File("src/main/resources/problem${this::class.java.simpleName.last()}/input.txt").bufferedReader().use(
                BufferedReader::readText
            ).split("\r?\n|\r".toRegex()).toMutableList()
        allTextList.removeAt(0)
        allTextList.let {
            it.filterIndexed { index, s -> index % 2 != 0 }
        }.forEach {
            val moneyArray = it.split(" ").map { it.toLong() }
            val sortedMoneyArray = moneyArray.distinct().sorted()
            var moneyMap = HashMap<Long, Int>()
            moneyArray.forEach {
                val key = moneyArray[moneyArray.indexOf(it)]
                val value = moneyArray.count { it == key }
                moneyMap.put(key, value)
            }
            var income: Long = 0
            var quantity = 0
            for (i in sortedMoneyArray.reversed()) {
                quantity += moneyMap.getValue(i)
                val currIncome = i * quantity
                if (currIncome > income) income = currIncome
            }
            println(income)
        }
    }
}