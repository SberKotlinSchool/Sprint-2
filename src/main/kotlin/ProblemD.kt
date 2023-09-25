class ProblemD {

    fun main() {

        val count = readInt()

        repeat(count) {
            var summTotal: Long = 0L
            val peoples = readInt() - 1
            val money = readListLong().sorted()

            for ( people in 0 .. peoples  ){
                var summ : Long = 0L
                 for ( dollars in money){
                     if ( dollars < money[people] )  continue

                     summ += money[people]

                     if ( summ > summTotal ) summTotal = summ

            }
            }

            println(summTotal)
            }
        }

}