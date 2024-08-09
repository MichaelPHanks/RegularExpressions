package org.example.FloatingPoint

import org.example.FloatingPoint.FloatingPointState
import org.example.FloatingPoint.FloatingPointVerifier

class NumberFirstFloatingPoint: FloatingPointState {
    override fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier) {
        if (char == ".")
        {
            floatingPointVerifier.state = FirstPeriodFloatingPoint()
        }
    }
}