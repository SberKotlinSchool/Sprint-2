class ProblemB {

    fun main() {
        val readLines = CustomReader().readResource("/problemB/input.txt");
        val countLines = readLines?.get(0)!!.toInt();
        val alphabet = "abcdefghijklmnopqrstuvwxyz"

        for (i in 1..countLines) {
            val list = readLines[i].split(" ").map { it.toInt() }
            val count = list[0]
            val letters = list[1]
            var answer = ""
            var counter = 0;
            while (counter < count) {
                for (k in 0 until letters) {
                    answer += alphabet[k]
                    if (++counter >= count) {
                        break
                    }
                }
            }
            println(answer)
        }
    }
}