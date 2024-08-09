package org.example.FloatingPoint

class FirstPeriodFloatingPoint: FloatingPointState {
    override fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier) {
        if (char in "0123456789")
        {
            floatingPointVerifier.state = ValidFloatingPoint()
        }

        else
        {
            floatingPointVerifier.state = InvalidFloatingPoint()
        }
    }
}