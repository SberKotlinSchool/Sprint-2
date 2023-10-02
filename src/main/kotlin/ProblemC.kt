class ProblemC {

    fun main() {
        val stringCount = readInt()
        var result = 0
        val skillsStudent = readIntArray(stringCount).sorted()
        for (i in skillsStudent.indices step 2){
            result += skillsStudent[i + 1] - skillsStudent[i]
        }
        println(result)

    }

}