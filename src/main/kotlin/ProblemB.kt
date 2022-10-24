class ProblemB {

    fun main() {
        // get alphabet
        var letter = 'a'
        var alphabet: List<String> = ArrayList()
        while (letter <= 'z') {
            alphabet += "$letter"
            ++letter
        }
        //get input and output
        var answers: List<String> = ArrayList()
        val q_requests = readInt()
        repeat(q_requests){
            var data = readListInt()
            var result = ""
            var alph_ = alphabet.filterIndexed{ index, value -> index < data[1] }
            var flag = true
            while (flag) for (char in alph_) {
                if (result.length >= data[0]) {
                    flag = false
                    break
                }
                else result += char
            }
            answers += result
        }
        for (item in answers) println(item)
    //output на тестовый input может быть различным!
    }
}