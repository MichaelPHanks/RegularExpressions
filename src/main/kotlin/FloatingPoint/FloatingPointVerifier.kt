package org.example.FloatingPoint

class FloatingPointVerifier {
    var state: FloatingPointState = FirstDigitFloatingPoint()


    fun verify(string: String): Boolean
    {
        state = FirstDigitFloatingPoint()
        string.chunked(1).forEach {
            state.consumeCharacter(it,this)
        }

        return this.state is ValidFloatingPoint
    }
}