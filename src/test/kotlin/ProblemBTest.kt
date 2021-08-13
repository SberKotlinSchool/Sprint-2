import org.junit.jupiter.api.Test

class ProblemBTest : BaseTest(workDir = "problemB") {

    @Test
    fun testSolution() {
        ProblemB().main()
        checkOutput()
    }
}