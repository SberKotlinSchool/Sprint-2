import kotlin.math.max

class ProblemD {

    fun sum_gamb(list_need: List<String>) {
        val maxPrice: Long = list_need.maxOf { it.toLong() } //Максимальная цена
        val minPrice: Long = list_need.minOf { it.toLong() } //Минимальная цена
        val avgPrice: Long = list_need.map { it.toLong() }.average().toLong() //Средняя цена

        val best_from_max = list_need.filter { s: String -> s.toLong() >= maxPrice}.count()
        val best_from_min = list_need.filter { s: String -> s.toLong() <= minPrice}.count()
        val best_from_avg = list_need.filter { s: String -> s.toLong() >= avgPrice}.count()

        val result_1 = listOf(best_from_max * maxPrice, best_from_min * minPrice, best_from_avg * avgPrice).maxOf { it }.toLong()

        if (result_1 == best_from_avg * avgPrice) {

            val minPrice_2 = list_need.filter { s: String -> s.toLong() >= avgPrice}.minOf { it.toLong() } //Минимальная цена с учётом медианы

            val result_2 = listOf(best_from_max * maxPrice, best_from_min * minPrice, best_from_avg * avgPrice, best_from_avg * minPrice_2 ).maxOf { it }.toLong()
            println(result_2)
        }
        else {println(result_1)}

    }

    fun main() {

        //ваша реализация в методе main
        val listtolist = input_dir_in_list(workdir = "problemD").filterIndexed {
                                                                    index,  String -> index.toInt() % 2 != 0
                                                                    }// input.txt

        //println(listtolist)
        for (f in listtolist) {
            sum_gamb(f)

        }
    }
}
fun main(args: Array<String>) {
    ProblemD().main()
}