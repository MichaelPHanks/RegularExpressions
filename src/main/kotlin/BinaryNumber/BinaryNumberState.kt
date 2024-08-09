package org.example.BinaryNumber

interface BinaryNumberState {
    fun consumeCharacter(char: String, binaryNumberVerifier: BinaryNumberVerifier)

}