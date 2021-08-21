class ProblemC {

    fun main() {

        val studentTotal : Int = readln().toInt()
        val skillLvlArray: IntArray = readIntArray(studentTotal).sortedArray()

        var totalAmountOfProblems = 0

        for (student in 0 until studentTotal step 2) {
            totalAmountOfProblems += skillLvlArray[student+1] - skillLvlArray[student]
        }
        print(totalAmountOfProblems)

    }

}
