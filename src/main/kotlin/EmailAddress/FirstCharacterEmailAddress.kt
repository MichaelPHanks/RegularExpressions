package org.example.EmailAddress

class FirstCharacterEmailAddress: EmailAddressState {
    override fun consumeCharacter(char: String, emailAddressVerifier: EmailAddressVerifier) {
        if (char == "@" || char == " ")
        {
            emailAddressVerifier.state = InvalidEmailAddress()
        }
        else
        {
            emailAddressVerifier.state = Part1EmailAddress()
        }
    }
}