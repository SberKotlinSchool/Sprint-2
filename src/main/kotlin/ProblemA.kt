class ProblemA {

    fun main() {
        val numOfFrogs = readInt()
        val frogData = Array(numOfFrogs){LongArray(3)}

        for (i in 0 until numOfFrogs){
            frogData[i] = readLongArray(3)
        }


        for(i in 0 until numOfFrogs){
            println(frogPath(rightJumpLength = frogData[i][0], leftJumpLength = frogData[i][1], countOfJumps = frogData[i][2]))
        }

    }
    fun frogPath(leftJumpLength: Long, rightJumpLength: Long, countOfJumps: Long): Long {
        var positionOfFrog: Long = 0
        var iterator = 0L
        while(iterator <= countOfJumps){

            positionOfFrog = (countOfJumps / 2) * (rightJumpLength - leftJumpLength) + (countOfJumps % 2) * rightJumpLength

            /*как красиво сделать отступы, в подобных случаях использования if как выражения?
            positionOfFrog += if (iterator in 0L until countOfJumps step 2) {
                                    rightJumpLength
                                } else {
                                    -leftJumpLength
                                }
            */
            iterator++
        }
        return positionOfFrog
    }
}