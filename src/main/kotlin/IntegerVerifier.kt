package org.example

class IntegerVerifier {
    var state: IntegerState = FirstDigitState()


    fun verify(string: String): Boolean
    {
        state = FirstDigitState()
        string.chunked(1).forEach {
            state.consumeCharacter(it,this)
        }

        return this.state is ValidState
    }
}