package org.example.FloatingPoint

interface FloatingPointState {
    fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier)

}