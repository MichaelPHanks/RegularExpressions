package org.example.Password

class OneSpecialNoCapitalPassword: PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        if (char in "ABCDEFGHIJKLMNOPQRSTUVWXYZ") {
            passwordVerifier.state = ValidPassword()
        }
    }
}