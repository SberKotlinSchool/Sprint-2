class ProblemA {

    fun main() {

      val count = readInt()

      repeat(count) { println( readListLong().run {
          ( this[2] + 1 ) / 2 * this[0] - this[2] / 2 * this[1] } ) }
    }
    }