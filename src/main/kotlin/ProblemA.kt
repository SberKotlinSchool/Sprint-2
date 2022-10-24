class ProblemA {

    fun sum_to(a: Int, b: Int, k: Int): Long {
        // Функция для расчёта
        var needs: Long = 0
        var counts = 0
        while (counts < k) {
            if (counts == 0) {needs += a} //Первый шаг
            else if (counts % 2 == 0) {needs += a} //Условие для четных
            else {needs -= b}
            ++counts
        }
        return needs
    }
    fun main() {

        //ваша реализация в методе main
        val listtolist = input_dir_in_list(workdir = "problemA") // input.txt

        //В цикле применяем функцию для каждого набора из списка
        for (f in listtolist) {
            var result = sum_to(a = f.get(0).toInt(), b = f.get(1).toInt(), k = f.get(2).toInt())
            println(result)
        }

    }
}

fun main(args: Array<String>) {
    ProblemA().main()
}