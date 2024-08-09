package org.example.BinaryNumber

class ValidBinaryNumber: BinaryNumberState {
    override fun consumeCharacter(char: String, binaryNumberVerifier: BinaryNumberVerifier) {
        if (char == "0")
        {
            binaryNumberVerifier.state = LastCharacterIsZeroBinaryNumber()
        }

        else if (char != "1")
        {
            binaryNumberVerifier.state = InvalidBinaryNumber()
        }
    }
}