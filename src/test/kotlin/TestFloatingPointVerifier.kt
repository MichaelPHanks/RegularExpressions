import org.example.FloatingPoint.FloatingPointVerifier
import org.example.Integer.IntegerVerifier
import kotlin.test.Test
import kotlin.test.assertEquals

class TestFloatingPointVerifier {
    @Test
    fun TestValidFloatingPoint()
    {
        val verifier = FloatingPointVerifier()

        assertEquals(true, verifier.verify("1.0"))
        assertEquals(true, verifier.verify("123.34"))
        assertEquals(true, verifier.verify("0.20000"))
        assertEquals(true, verifier.verify("12349871234.12340981234098"))
        assertEquals(true, verifier.verify(".123"))



    }

    @Test
    fun TestInvalidFloatingPoint()
    {
        val verifier = FloatingPointVerifier()

        assertEquals(false, verifier.verify("123"))
        assertEquals(false, verifier.verify("123.123."))
        assertEquals(false, verifier.verify("123.02a"))
        assertEquals(false, verifier.verify("123.z02a"))
        assertEquals(false, verifier.verify("z123.123"))

        assertEquals(false, verifier.verify("123."))
        assertEquals(false, verifier.verify("012.4"))
    }
}