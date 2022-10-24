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
        /*
        val path = System.getProperty("user.dir") // Системная директория
        val dir = "$path/src/main/resources/problemA/input.txt" // абсолютный путь к входному файлу
        val InputSt = File(dir).inputStream() // Считываем файл
        val listtolist = mutableListOf<List<String>>() //Создаём пустой список для входа
        val OutputList = mutableListOf<Long>() //Создаём пустой список для выхода
        // Добавляем в пустой список наши данные (без учёта первой строки)
        InputSt.bufferedReader().forEachLine { listtolist.add(it.split(" ")) }
        listtolist.removeAt(0)
         */
        val listtolist = input_dir_in_list(workdir = "problemA")
        val OutputList = mutableListOf<Long>() //Создаём пустой список для выхода

        for (f in listtolist) {
            var result = sum_to(a = f.get(0).toInt(), b = f.get(1).toInt(), k = f.get(2).toInt())
            OutputList.add(result)
            println(result)
        }

    }
}

fun main(args: Array<String>) {
    ProblemA().main()
}