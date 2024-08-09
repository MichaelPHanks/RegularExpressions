package org.example.EmailAddress

import org.example.BinaryNumber.BinaryNumberState
import org.example.BinaryNumber.FirstDigitBinaryNumber
import org.example.BinaryNumber.ValidBinaryNumber

class EmailAddressVerifier {
    var state: EmailAddressState = FirstCharacterEmailAddress()


    fun verify(string: String): Boolean
    {
        state = FirstCharacterEmailAddress()
        string.chunked(1).forEach {
            state.consumeCharacter(it,this)
        }

        return this.state is ValidEmailAddress
    }
}