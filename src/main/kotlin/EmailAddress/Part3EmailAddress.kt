package org.example.EmailAddress

class Part3EmailAddress: EmailAddressState {
    override fun consumeCharacter(char: String, emailAddressVerifier: EmailAddressVerifier) {
        if (char == "@" || char == " " || char == ".")
        {
            emailAddressVerifier.state = InvalidEmailAddress()
        }
        else
        {
            emailAddressVerifier.state = ValidEmailAddress()
        }
    }
}