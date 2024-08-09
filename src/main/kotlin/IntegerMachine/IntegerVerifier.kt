package org.example.Integer

class IntegerVerifier {
    var state: IntegerState = FirstDigitInteger()


    fun verify(string: String): Boolean
    {
        state = FirstDigitInteger()
        string.chunked(1).forEach {
            state.consumeCharacter(it,this)
        }

        return this.state is ValidInteger
    }
}