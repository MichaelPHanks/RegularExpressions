package org.example.FloatingPoint

import org.example.Integer.IntegerVerifier
import org.example.Integer.InvalidInteger
import org.example.Integer.ValidInteger

class FirstDigitFloatingPoint: FloatingPointState {

    override fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier) {
        if (char in "0")
        {
            floatingPointVerifier.state = ZeroFirstFloatingPoint()
        }
        else if (char in ".")
        {
            floatingPointVerifier.state = FirstPeriodFloatingPoint()
        }
        else if (char in "123456789")
        {
            floatingPointVerifier.state = NumberFirstFloatingPoint()
        }
        else
        {
            floatingPointVerifier.state = InvalidFloatingPoint()
        }
    }

}