import java.util.stream.Collectors

class ProblemB {

    val alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray()

    fun main() {
        var numberOfStrings = readLine()
        if (numberOfStrings != null) {
            for (i in 1..numberOfStrings.toInt()) {
                buildString(readLine())
                if(i < numberOfStrings.toInt()) print("\n")
            }
        }
    }

    fun buildString(line: String?) {
        var stringParams = line?.split(" ")?.stream()?.map { l -> l.toInt() }?.collect(Collectors.toList())
        var resultStr = StringBuilder()
        if (stringParams != null && stringParams.size == 2) {
            val numberOfCicles = if(stringParams[0] >= stringParams [1]) stringParams[0] / stringParams[1] else 0
            val tailSize = stringParams[0] - numberOfCicles * stringParams [1]
            for (c in 1.. numberOfCicles){
                for (i in 0..stringParams[1]-1){
                    resultStr.append(alphabet[i])
                }
            }
            for (i in 0..tailSize-1){
                resultStr.append(alphabet[i])
            }
        }
        print(resultStr.toString())
    }
}