import java.util.stream.Collectors

class ProblemC {

    fun main() {
        //ваша реализация в методе main
        val cnt = readInt()
        val skills = readListInt().sorted()
        var result = 0
        for (i in 1..cnt - 1 step 2) {
            result += skills[i] - skills[i-1]
        }
        println(result)
    }

}