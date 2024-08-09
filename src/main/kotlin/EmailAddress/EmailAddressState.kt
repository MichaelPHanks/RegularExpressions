package org.example.EmailAddress

interface EmailAddressState {
    fun consumeCharacter(char: String, emailAddressVerifier: EmailAddressVerifier)

}