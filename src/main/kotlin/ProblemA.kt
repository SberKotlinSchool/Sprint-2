class ProblemA {

    fun main() {
        val commandSteps = readInt();
        for(i in 1..commandSteps)
        {
            val inputData = readListLong();
            val a = inputData[0];
            val b = inputData[1];
            val k = inputData[2];
            val repeat = k/2;
            val left = k%2;
            val result = ( a - b ) * repeat + ( a * left );
            println(result);
        }
    }

}