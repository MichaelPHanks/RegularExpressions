import org.example.BinaryNumber.BinaryNumberVerifier
import kotlin.test.Test
import kotlin.test.assertEquals

class TestBinaryNumberVerifier {
    @Test
    fun TestValidBinaryNumbers()
    {
        val verifier = BinaryNumberVerifier()

        assertEquals(true, verifier.verify("1"))
        assertEquals(true, verifier.verify("11"))
        assertEquals(true, verifier.verify("101"))
        assertEquals(true, verifier.verify("111111"))
        assertEquals(true, verifier.verify("10011010001"))


    }

    @Test
    fun TestInvalidBinaryNumbers()
    {
        val verifier = BinaryNumberVerifier()

        assertEquals(false, verifier.verify("01"))
        assertEquals(false, verifier.verify("10"))
        assertEquals(false, verifier.verify("1000010"))
        assertEquals(false, verifier.verify("100a01"))
        assertEquals(false, verifier.verify("10011010001a"))

    }
}