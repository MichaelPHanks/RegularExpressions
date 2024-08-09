package org.example.BinaryNumber

class FirstDigitBinaryNumber: BinaryNumberState {
    override fun consumeCharacter(char: String, binaryNumberVerifier: BinaryNumberVerifier) {
        if (char == "1")
        {
            binaryNumberVerifier.state = ValidBinaryNumber()
        }
        else
        {
            binaryNumberVerifier.state = InvalidBinaryNumber()
        }
    }
}