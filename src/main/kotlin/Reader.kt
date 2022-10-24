import java.io.File

fun readln() = readLine()!!

fun readInt() = readln().toInt()
fun readLong() = readln().toLong()
fun readStrings() = readln().trim().split(" ")

fun readIntArray(size:Int) = readStrings().run { IntArray(size) { get(it).toInt() } }
fun readLongArray(size:Int) = readStrings().run { LongArray(size) { get(it).toLong() } }

fun readListInt() = readStrings().map { it.toInt() }
fun readListLong() = readStrings().map { it.toLong() }


fun input_dir_in_list(workdir: String): MutableList<List<String>> {
    val path = System.getProperty("user.dir") // Системная директория
    val dir = "$path/src/main/resources/$workdir/input.txt" // абсолютный путь к входному файлу
    val InputSt = File(dir).inputStream() // Считываем файл
    val listtolist = mutableListOf<List<String>>() //Создаём пустой список для входа
    // Добавляем в пустой список наши данные (без учёта первой строки)
    InputSt.bufferedReader().forEachLine { listtolist.add(it.split(" ")) }
    listtolist.removeAt(0)
    return listtolist
}