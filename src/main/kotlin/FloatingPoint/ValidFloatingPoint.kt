package org.example.FloatingPoint

import org.example.FloatingPoint.FloatingPointState
import org.example.FloatingPoint.FloatingPointVerifier

class ValidFloatingPoint: FloatingPointState {
    override fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier) {
        if (char !in "0123456789")
        {
            floatingPointVerifier.state = InvalidFloatingPoint()
        }

    }
}