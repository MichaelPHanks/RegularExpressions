package org.example.Password

class ValidPassword: PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        if (char in "(!@#$%&*)")
        {
            passwordVerifier.state = SpecialCharacterAtEndPassword()
        }
    }
}