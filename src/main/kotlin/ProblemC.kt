class ProblemC {

    fun main() {
        val inputStringsQnt = readInt()
        //input
        val studentsExp = readIntArray(inputStringsQnt).toList()
        //output
        println(calculateMinTraining(studentsExp))
    }
}

/**
 * Расчет минимального количества задач для подготовки перед разбиением на пары
 * @property studentsExp список опыта студентов
 */
fun calculateMinTraining(studentsExp: List<Int>): Int {
    // в отсортированном массиве просуммируем разницы в exp между парами соседних студентов, это и будет минимальное кол-во заданий
    val sortedExp = studentsExp.sorted()
    var result = 0
    for (i in 1..sortedExp.size step 2) {
        result += sortedExp[i] - sortedExp[i-1]
    }
    return result
}



