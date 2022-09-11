class ProblemC {

    fun main() {
        val students = readInt()
        val knowledge = readIntArray(students)
        knowledge.sort()
        var delta  = 0
        for(i in knowledge.indices step 2) {
            delta = delta + knowledge[i + 1] - knowledge[i]
        }
        println(delta)
    }

}