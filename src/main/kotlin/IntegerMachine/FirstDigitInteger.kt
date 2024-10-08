package org.example.Integer

class FirstDigitInteger: IntegerState {
    override fun consumeCharacter(char: String, integerVerifier: IntegerVerifier) {
        if (char in "123456789")
        {
            integerVerifier.state = ValidInteger()
        }
        else
        {
            integerVerifier.state = InvalidInteger()
        }
    }
}