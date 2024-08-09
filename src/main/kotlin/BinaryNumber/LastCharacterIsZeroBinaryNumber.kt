package org.example.BinaryNumber

class LastCharacterIsZeroBinaryNumber: BinaryNumberState {
    override fun consumeCharacter(char: String, binaryNumberVerifier: BinaryNumberVerifier) {
        if (char == "1")
        {
            binaryNumberVerifier.state = ValidBinaryNumber()
        }

        else if (char != "0")
        {
            binaryNumberVerifier.state = InvalidBinaryNumber()
        }
    }
}