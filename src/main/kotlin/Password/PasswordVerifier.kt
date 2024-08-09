package org.example.Password

import org.example.EmailAddress.EmailAddressState
import org.example.EmailAddress.FirstCharacterEmailAddress
import org.example.EmailAddress.ValidEmailAddress

class PasswordVerifier {
    var state: PasswordState = NoCapitalOrSpecialPassword()


    fun verify(string: String): Boolean
    {

        state = NoCapitalOrSpecialPassword()
        if (string.length < 8)
        {
            this.state = InvalidPassword()
        }
        string.chunked(1).forEach {
            state.consumeCharacter(it,this)
        }

        return this.state is ValidPassword
    }
}