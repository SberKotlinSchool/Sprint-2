class ProblemB {

    fun output_dl(n: Int, k: Int): String {
        // n - длинна букв
        val latins = CharRange('a','z').toMutableList().take(n = k) // Алфавит
        val mins = n / k // Минимальная частота вхождений
        var timers = 0
        val need_more = n - (mins * k) // Разница между желаемым и возможным повторением
        var result: String = ""
            for (cc in 1..mins) {
                for (z in latins) {
                    result += z
                }
            }
            if (need_more > 0) {
                for (z in latins){
                    if (timers == need_more) {break}
                    result += z
                    timers +=1
                }
            }
        return result

    }

    fun main() {

        //ваша реализация в методе main
        //output на тестовый input может быть различным!
        val listtolist = input_dir_in_list(workdir = "problemB")
        for (f in listtolist) {
            var result = output_dl(n = f.get(0).toInt(), k = f.get(1).toInt())
            println(result)
        }
    }
}

fun main(args: Array<String>) {
    ProblemB().main()
}