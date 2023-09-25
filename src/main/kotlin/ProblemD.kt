class ProblemD {

    fun main() {
        var dataSet = readInt()
        while (dataSet-- > 0) {
            readInt()
            val visitorsCash = readListLong()
            println(getMaxCost(visitorsCash.sorted()))
        }
    }

}

fun getMaxCost(list: List<Long>): Long {
    var max = list.size * list[0]
    for (i in 1 until list.size) {
        var max2 = 0L
        for (j in list) {
            if (j >= list[i]) {
                max2 += list[i]
            }
        }
        if (max < max2) {
            max = max2
        }
    }
    return max
}