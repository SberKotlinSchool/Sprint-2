class ProblemC {

    fun main() {
        val students = readInt();
        val skills = readListInt().sorted();
        var result = 0;
        skills.forEachIndexed { index, element ->
            if (index % 2 != 0) {
                result += element - skills[index-1];
            }
        }
        println(result);
    }

}