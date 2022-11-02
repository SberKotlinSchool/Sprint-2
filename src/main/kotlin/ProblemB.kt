class ProblemB {

    fun main() {

        Array(readInt()) { readIntArray(2) }.forEach {
            var j = 0;
            for (i in 1 .. it[0]) {
                print(Char('a'.toInt() + j++))
                if (j >= it[1]) j = 0;
            }
            println()
        }
    }

}