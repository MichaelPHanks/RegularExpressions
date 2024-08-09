package org.example.Password

class SpecialCharacterAtEndPassword: PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        if (char !in "(!@#$%&*)")
        {
            passwordVerifier.state = ValidPassword()
        }

    }
}