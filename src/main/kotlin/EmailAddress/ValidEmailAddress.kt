package org.example.EmailAddress

class ValidEmailAddress: EmailAddressState {
    override fun consumeCharacter(char: String, emailAddressVerifier: EmailAddressVerifier) {
        if (char == "@" || char == " " || char == ".")
        {
            emailAddressVerifier.state = InvalidEmailAddress()
        }
    }
}