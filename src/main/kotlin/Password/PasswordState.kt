package org.example.Password

interface PasswordState {
    fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier)

}