import org.example.Password.PasswordVerifier
import kotlin.test.Test
import kotlin.test.assertEquals

class TestComplexPasswordVerifier {
    @Test
    fun TestValidPasswords()
    {
        val verifier = PasswordVerifier()
        assertEquals(true, verifier.verify("aaaaH!aa"))
        assertEquals(true, verifier.verify("1234567*9J"))
        assertEquals(true, verifier.verify("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH"))
        assertEquals(true, verifier.verify("abcdef!H!s"))

    }

    @Test
    fun TestInvalidPasswords()
    {
        val verifier = PasswordVerifier()
        assertEquals(false, verifier.verify("a"))
        assertEquals(false, verifier.verify("aaaaaaa!"))
        assertEquals(false, verifier.verify("aaaHaaaaa"))
        assertEquals(false, verifier.verify("Abbbbbbb!"))

    }
}