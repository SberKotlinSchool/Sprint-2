import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ProblemBTest : BaseTest(workDir = "problemB") {

    @Test
    fun testSolution() {
        ProblemB().main()
        checkOutput()
    }

    /**
     * Тестовый метод работает некорректно по отношению к условию,
     * так как не учитывает различные перестановки в результате выполнения программы при сравнении с содержимым output.txt
     */
    override fun checkOutput() {
        val resultString = super.outputStream.toString("UTF-8")
        val expectedOutPut = this::class.java.getResource("$workDir/output.txt")!!.readText()

        val whitespaceRegex = "\\s+".toRegex()
        val expectedOutputSplit = expectedOutPut.trim().split(whitespaceRegex)
        val resultStringSplit = resultString.trim().split(whitespaceRegex)
        assertEquals(expectedOutputSplit.size, resultStringSplit.size)

        expectedOutputSplit.forEachIndexed { index, value -> assertTrue { countSymbols(value) contentEquals countSymbols(resultStringSplit[index]) } }
    }

    private fun countSymbols(input: String): IntArray {
        val charsMap = mutableMapOf<Char, Int>()

        input.forEach {
            charsMap[it] = charsMap.getOrDefault(it, 0) + 1
        }

        return charsMap.values.toIntArray().sortedArray()
    }

}