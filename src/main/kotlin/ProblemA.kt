class ProblemA {

    fun main() {
        var answers: List<Long> = ArrayList()
        val q_requests = readInt()
        repeat(q_requests){
            var data = readListLong()
            var result = 0L
            for(i in 1..data[2]){ when(i % 2L == 0L){
                false -> result += data[0]
                true -> result -= data[1]
                }
            }
            answers += result
        }
        for (item in answers) println(item)
    }
}