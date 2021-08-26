import kotlin.math.max

fun readln() = readLine()!!

fun readInt() = readln().toInt()
fun readLong() = readln().toLong()
fun readStrings() = readln().trim().split(" ")

fun readIntArray(size:Int) = readStrings().run { IntArray(size) { get(it).toInt() } }

fun readListInt() = readStrings().map { it.toInt() }
fun readListLong() = readStrings().map { it.toLong() }

fun problemA() {
//  Введите колличество циклов
    var numberOfRequests = readLine()!!.toInt()

    for (i in 1..numberOfRequests) {
//  Введите три числа через пробел
        var threeValue = readLine()!!.trim().split(" ").run { IntArray(3) { get(it).toInt() } }

        var theFrogsPosition: Long = 0

        var positiveJump = threeValue[0].toLong()
        var negativeJump = threeValue[1].toLong()
        var amountOfJumps = threeValue[2].toLong()
//  Вычисление конечной позиции лягушки
        theFrogsPosition += (amountOfJumps / 2 * (positiveJump - negativeJump) + ((amountOfJumps % 2) * positiveJump))
        println(theFrogsPosition)
    }
}
fun problemB() {
//    Введите колличество циклов
    var numberOfRequests = readLine()!!.toInt()
    repeat(numberOfRequests){
//    Введите два числа длину строки и колличество символов через пробел
        val twoValue = readLine()!!.trim().split(" ").run { IntArray(2) { get(it).toInt() } }
        for (i in 0..twoValue[0]) {
            val charCode= 97 + (i % twoValue[1])
            val char = Char(charCode)
            print(char)
        }
        println()
    }
}

fun problemC() {
//    Введите колличество студентов
    var students = readLine()!!.toInt()
//    Введите для каждого студента значение умения программировать через пробел
    val programmingSkills = readLine()!!.trim().split(" ").run { IntArray(students) { get(it).toInt() } }
    programmingSkills.sort()
    var miniNumberOfTasks = 0
//    Вычисляем минимальное количество задач,для формирования команд
    for (i in 0..programmingSkills.size - 2) {
        if (i % 2 != 0) continue
        miniNumberOfTasks += programmingSkills[i + 1] - programmingSkills[i]
    }
    print(miniNumberOfTasks)
}
fun problemD() {
//    Введите колличество циклов
    var numberOfRequests = readLine()!!.toInt()

    repeat(numberOfRequests) {
        var marginMax: Long = 0
//    Введите колличество клиентов
        var numberOfClients = readLine()!!.toInt()
//    Введите колличество монет для каждого клиента через пробел
        val listNumberOfCoins = readLine()!!.trim().split(" ").run { LongArray(numberOfClients) { get(it).toLong() } }
        listNumberOfCoins.sortDescending()
//    Вычисляем максимальную прибыль кафе
        for ((index, value) in listNumberOfCoins.withIndex()) {
            var margin: Long = value * (index + 1)
            marginMax = max(margin, marginMax)
        }
        println(marginMax)
    }
}






