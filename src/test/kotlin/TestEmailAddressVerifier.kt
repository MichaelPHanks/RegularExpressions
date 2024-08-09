import org.example.EmailAddress.EmailAddressVerifier
import kotlin.test.Test
import kotlin.test.assertEquals

class TestEmailAddressVerifier {
    @Test
    fun TestValidEmailAddress()
    {
        val verifier = EmailAddressVerifier()
        assertEquals(true, verifier.verify("a@b.c"))
        assertEquals(true, verifier.verify("michael.hanks@usu.edu"))
        assertEquals(true, verifier.verify("{}*$.&$*(@*$%&.*&*"))

    }

    @Test
    fun TestInvalidEmailAddress()
    {
        val verifier = EmailAddressVerifier()
        assertEquals(false, verifier.verify("@b.c"))
        assertEquals(false, verifier.verify("a@b@c.com"))
        assertEquals(false, verifier.verify("a.b@b.b.c"))
        assertEquals(false, verifier.verify("michael hanks@usu.edu"))
        assertEquals(false, verifier.verify("michael.hanks@usu.@edu"))


    }
}