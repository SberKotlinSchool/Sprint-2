import org.junit.jupiter.api.BeforeEach
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.PrintStream
import kotlin.test.assertEquals

open class BaseTest(val workDir: String) {
    protected lateinit var outputStream: ByteArrayOutputStream
    private lateinit var inputStream: InputStream

    @BeforeEach
    fun set() {
        outputStream = ByteArrayOutputStream()
        val ps = PrintStream(outputStream)
        System.setOut(ps)
        inputStream = this::class.java.getResource("$workDir/input.txt")!!.openStream()
        System.setIn(inputStream)
    }

    open fun checkOutput() {
        val resultString = outputStream.toString("UTF-8")
        val expectedOutPut = this::class.java.getResource("$workDir/output.txt")!!.readText()
        assertEquals(expectedOutPut, resultString.trim(), "Not equals")
    }
}