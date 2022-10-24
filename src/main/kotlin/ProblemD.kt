class ProblemD {

    fun main() {
        var answers: List<Long> = ArrayList()
        val q_requests = readInt()
        repeat(q_requests) {
            var q_clients = readInt()
            var data = readListLong().sorted()
            var max = data[q_clients-1]
            for (num in data){
                var temp_result = num*q_clients
                if (temp_result > max) {
                    max = temp_result
                    q_clients -= 1
                } else q_clients -= 1
            }
            answers += max
        }
        for (item in answers) println(item)
    }
}