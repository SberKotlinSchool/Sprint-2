import java.util.stream.Collectors

class ProblemA {

    fun main() {
        var numberOfFrogs = readLine()
        if (numberOfFrogs != null) {
            for (i in 1..numberOfFrogs.toInt()) {
                processFrog(readLine())
                if(i < numberOfFrogs.toInt()) print("\n")
            }
        }
    }

    fun processFrog(line: String?) {
        val jumps = line?.split(" ")?.stream()?.map { l -> l.toInt() }?.collect(Collectors.toList())
        var position = 0L
        if (jumps != null && jumps.size == 3) {
            for (i in 0..jumps[2]-1){
                if (i % 2 == 0) position = position + jumps[0]
                else position = position - jumps[1]
            }
        }
        print(position)
    }

}