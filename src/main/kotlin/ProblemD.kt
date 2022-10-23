class ProblemD {

    fun main() {
        val commandSteps = readInt();
        for(i in 1..commandSteps)
        {
            val customerNumber = readInt();
            val inputData = readListLong();
            val result = inputData.sortedDescending().withIndex().maxOf { ( it.index +1 ) * it.value }
            println(result);
        }
    }
}