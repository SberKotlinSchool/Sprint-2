import java.util.stream.Collectors
import kotlin.math.abs

class ProblemC {

    fun main() {
        var numberOfStudens = readLine()

        var studentLevels = readLine()?.split(" ")?.stream()?.map { l -> l.toInt() }?.collect(Collectors.toList())
        studentLevels?.sort()

        var numberOfExercises = 0
        for(i in 0..studentLevels?.size!!-2 step 2){
            numberOfExercises += abs(studentLevels[i] - studentLevels[i+1])
        }

        print(numberOfExercises)
    }

}