class ProblemB {

    fun main() {
        val commandSteps = readInt();
        for(i in 1..commandSteps)
        {
            val inputData = readListInt();
            val length = inputData[0]-1;
            val charNumber = inputData[1];
            var result = ""
            for(l in 0..length)
            {
                result += 'a' + l % charNumber;
            }
            println(result);
        }
    }

}