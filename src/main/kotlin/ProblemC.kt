class ProblemC {

    fun main() {
        // количество студентов
        val n = readInt()
        // скилл студентов
        val a = readln().split(' ').map(String::toInt).sorted()
        // общее количество задач
        var taskCount = 0
        for (i in 1 .. n step 2)
            taskCount += a[i] - a[i-1]

        println(taskCount)
    }

}