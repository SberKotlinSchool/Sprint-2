import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class HelloKotlinTest {
    lateinit var outputStream: ByteArrayOutputStream
    @BeforeEach
    fun set() {
        outputStream = ByteArrayOutputStream()
        val ps = PrintStream(outputStream)
        System.setOut(ps)
    }

    @Test
    fun testSolution() {
        printHello()
        val resultString = outputStream.toString("UTF-8")
        assertEquals("Hello, Kotlin!", resultString.trim(), "Not equals")
    }
}