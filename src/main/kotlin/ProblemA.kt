class ProblemA {

    fun main() {
        //ваша реализация в методе main
        val t = readInt()
        for (i in 1..t) {
            val params = readListLong()
            println(calculateTotalLength(params[0], params[1], params[2]))
        }
    }

    private fun calculateTotalLength(firstLength: Long, secondLength: Long, amount: Long): Long {
        var len = 0L
        /*val len1 = amount.downTo(1).toList()
            .fold(0L) { sum, element ->
                if (element.mod(2) != 0)
                    (sum.plus(firstLength))
                else
                    sum.minus(secondLength)
            }*/
        for (i in amount downTo 1)
            if (i.mod(2) != 0) {
                len += firstLength
            } else {
                len -= secondLength
            }
        return len
    }

}