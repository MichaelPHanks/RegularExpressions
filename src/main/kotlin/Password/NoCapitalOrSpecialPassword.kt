package org.example.Password

class NoCapitalOrSpecialPassword: PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        if (char in "(!@#$%&*)")
        {
            passwordVerifier.state = OneSpecialNoCapitalPassword()
        }

        else if (char in "ABCDEFGHIJKLMNOPQRSTUVWXYZ") {
            passwordVerifier.state = OneCapitalNoSpecialPassword()
        }


    }
}