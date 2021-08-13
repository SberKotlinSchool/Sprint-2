import org.junit.jupiter.api.Test

class ProblemDTest : BaseTest(workDir = "problemD") {

    @Test
    fun testSolution() {
        ProblemD().main()
        checkOutput()
    }
}