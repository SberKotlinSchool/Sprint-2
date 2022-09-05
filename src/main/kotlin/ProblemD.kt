class ProblemD {

    fun main() {
        val countLines = readInt();
        for (l in 0 until countLines) {
            val clientsCount = readLong()
            val clientsList = readListLong()
            val map = mutableMapOf<Long, Long>()
            for (c in 0 until clientsCount) {
                val l1 = clientsList[c.toInt()]
                val sum = clientsList.filter { x -> l1 <= x }.count() * l1
                map.put(l1, sum)

            }
            println(map.maxByOrNull { it.value }?.value)
        }
    }
}