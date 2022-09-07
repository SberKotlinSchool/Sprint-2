import java.lang.Long.max

class ProblemD {

    fun main() {
        //ваша реализация в методе main
        val cnt = readInt();
        for (i in 1..cnt) {
            val clientCnt = readLong();
            val clients = readListLong().sortedDescending();
            println(calcCost(clients));
        }
    }

    fun calcCost(clients: List<Long>) : Long {
        var result: Long = 0;
        for (i in clients.size-1 downTo 0) {
            val burgerCost = clients[i];
            val income = clients.filter { it >= burgerCost }.size * burgerCost;
            result = max(income, result)
        }
        return result;
    }

}