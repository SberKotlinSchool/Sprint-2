import java.io.File

class ProblemB {

    fun main() {

        //ваша реализация в методе main
        //output на тестовый input может быть различным!
        val path = System.getProperty("user.dir") // Системная директория
        val dir = "$path/src/main/resources/problemB/input.txt" // абсолютный путь к входному файлу
        val InputSt = File(dir).inputStream() // Считываем файл
        val listtolist = mutableListOf<List<String>>() //Создаём пустой список для входа
        val OutputList = mutableListOf<Long>() //Создаём пустой список для выхода
        // Добавляем в пустой список наши данные (без учёта первой строки)
        InputSt.bufferedReader().forEachLine { listtolist.add(it.split(" ")) }
        listtolist.removeAt(0)
        println(listtolist)
    }

}

fun main(args: Array<String>) {
    ProblemB().main()
}