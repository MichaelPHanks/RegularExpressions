package org.example.EmailAddress

class Part2EmailAddress: EmailAddressState {
    override fun consumeCharacter(char: String, emailAddressVerifier: EmailAddressVerifier) {
        if (char == ".")
        {
            emailAddressVerifier.state = Part3EmailAddress()
        }
        else if (char == " " || char == "@")
        {
            emailAddressVerifier.state = InvalidEmailAddress()
        }
    }
}