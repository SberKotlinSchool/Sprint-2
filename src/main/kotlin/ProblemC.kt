class ProblemC {

    fun main() {
        val readLines = CustomReader().readResource("/problemC/input.txt");
        val students = readLines?.get(0)!!.toInt();

        val list = readLines[1].split(" ").map { it.toInt() }.sorted()
        var counter = 0;
        for (i in list.indices step 2) {
            counter += list[i] - list[i + 1]
        }

        println(Math.abs(counter))
    }

}