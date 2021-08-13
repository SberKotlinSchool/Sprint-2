import org.junit.jupiter.api.Test

class ProblemATest : BaseTest(workDir = "problemA") {

    @Test
    fun testSolution() {
        ProblemA().main()
        checkOutput()
    }
}