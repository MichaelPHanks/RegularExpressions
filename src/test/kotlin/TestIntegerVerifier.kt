import org.example.Integer.IntegerVerifier
import kotlin.test.Test
import kotlin.test.assertEquals

class TestIntegerVerifier {

    @Test
    fun TestValidIntegers()
    {
        val verifier = IntegerVerifier()
        assertEquals(true, verifier.verify("1"))
        assertEquals(true, verifier.verify("123"))
        assertEquals(true, verifier.verify("34512358798347592734587"))

    }

    @Test
    fun TestInvalidIntegers()
    {
        val verifier = IntegerVerifier()
        assertEquals(false, verifier.verify(""))
        assertEquals(false, verifier.verify("0123"))
        assertEquals(false, verifier.verify("132a"))
        assertEquals(false, verifier.verify("0"))

    }
}