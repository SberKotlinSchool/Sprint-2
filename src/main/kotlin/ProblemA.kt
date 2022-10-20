class ProblemA {

    fun main(){

        //ваша реализация в методе main
        val countRequests = readLong()
        for (i in 1..countRequests)
            println(calcPlaceOfFrog(readListLong()))
    }

    private fun calcPlaceOfFrog(args: List<Long>) : Long{

        val (a, b, k)= args

        val result: Long = if (a == b){
            if (k % 2 == 0L) 0 else a
        } else{
            (k / 2 * (-b)) + (a * (k - (k / 2)))
        }
        return result
    }
}