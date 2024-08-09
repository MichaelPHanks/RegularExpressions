package org.example.BinaryNumber

import org.example.FloatingPoint.FirstDigitFloatingPoint
import org.example.FloatingPoint.FloatingPointState
import org.example.FloatingPoint.ValidFloatingPoint

class BinaryNumberVerifier {
    var state: BinaryNumberState = FirstDigitBinaryNumber()


    fun verify(string: String): Boolean
    {
        state = FirstDigitBinaryNumber()
        string.chunked(1).forEach {
            state.consumeCharacter(it,this)
        }

        return this.state is ValidBinaryNumber
    }
}