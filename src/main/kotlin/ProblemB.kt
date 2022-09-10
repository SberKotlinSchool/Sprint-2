class ProblemB {

    fun main() {

        val t = readInt()
        for(i in 1..t){
            val nk = readIntArray(2)
            for(j in 0..nk[0]-1){
                print('a' + j%nk[1])
            }
            println()

        }

    }

}