import org.junit.jupiter.api.Test

class ProblemCTest : BaseTest(workDir = "problemC") {

    @Test
    fun testSolution() {
        ProblemC().main()
        checkOutput()
    }
}