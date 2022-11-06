class ProblemC {

    fun main() {

        var skills = readIntArray(readInt()).sortedArrayDescending();
        var sum = 0;
        for (i in 0 until skills.size - 1 step 2) {
            sum += skills[i]-skills[i+1]
        }
        println(sum)
    }
}