package org.example.EmailAddress

class Part1EmailAddress: EmailAddressState {
    override fun consumeCharacter(char: String, emailAddressVerifier: EmailAddressVerifier) {
        if (char == "@")
        {
            emailAddressVerifier.state = Part2EmailAddress()
        }
        else if (char == " ")
        {
            emailAddressVerifier.state = InvalidEmailAddress()
        }
    }
}