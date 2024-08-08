package org.example

class FirstDigitState: IntegerState {
    override fun consumeCharacter(char: String, integerVerifier: IntegerVerifier) {
        if (char in "123456789")
        {
            integerVerifier.state = ValidState()
        }
        else
        {
            integerVerifier.state = InvalidState()
        }
    }
}