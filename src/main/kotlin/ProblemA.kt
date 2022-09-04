class ProblemA {

    fun main() {
        val readLines = CustomReader().readResource("/problemA/input.txt");
        val count = readLines?.get(0)!!.toInt();

        for (i in 1..count){
            val list = readLines[i].split(" ")
            val a = list.get(0).toLong() //right
            val b = list.get(1).toLong() //left
            val k = list.get(2).toInt() //count

            var position= 0L ;
            for (i in 1..k){
                if (i % 2 == 0) {
                    position -= b
                } else {
                    position += a
                }
            }
            println(position)
        }
    }
}