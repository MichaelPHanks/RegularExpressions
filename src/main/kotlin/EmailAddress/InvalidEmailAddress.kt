package org.example.EmailAddress

class InvalidEmailAddress: EmailAddressState {
    override fun consumeCharacter(char: String, emailAddressVerifier: EmailAddressVerifier) {
    }
}