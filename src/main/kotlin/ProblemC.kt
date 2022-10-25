import java.util.Arrays.copyOfRange
import kotlin.math.abs

class ProblemC {

    fun main() {

        //ваша реализация в методе main
        val countStudents = readInt()
        val ratings = readIntArray(countStudents)
        println(calculateTaskRecur(ratings).toString())
    }

    private fun calculateTaskRecur(ratings: IntArray): Int {
        if (ratings.size < 2) return 0

        var notUsesStudents = IntArray(ratings.size - 2)
        val rating = ratings[0]
        var minDiff = Int.MAX_VALUE
        var minRating: Int? = null;
        var newIndex = 0
        for (i in 1..ratings.size-1){
            if (minDiff > abs(rating - ratings[i])){
                minDiff = abs(rating - ratings[i])
                if (minRating != null) {
                    notUsesStudents[newIndex] = minRating
                    newIndex++
                }
                minRating = ratings[i]
            } else {
                notUsesStudents[newIndex] = ratings[i]
                newIndex++
            }
        }
        return minDiff + calculateTaskRecur(notUsesStudents)
    }
}