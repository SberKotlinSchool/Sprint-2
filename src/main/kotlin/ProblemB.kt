class ProblemB {
    fun main() {
        var steps = readInt()
        while (steps-- > 0) {
            val line = readListInt().toMutableList()
            var string = ""
            var shift = 0
            while (line[0]-- > 0) {
                if (shift >= line[1]) {
                    shift = 0
                }
                val letter = 'a' + shift++
                string += letter
            }
            println(string)
        }
    }
}