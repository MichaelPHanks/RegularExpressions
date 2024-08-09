package org.example.FloatingPoint

class ZeroFirstFloatingPoint: FloatingPointState {
    override fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier) {
        if (char == ".")
        {
            floatingPointVerifier.state = FirstPeriodFloatingPoint()
        }
        else {
            floatingPointVerifier.state = InvalidFloatingPoint()
        }
    }
}