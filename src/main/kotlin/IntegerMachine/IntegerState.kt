package org.example.Integer

import org.example.Integer.IntegerVerifier

interface IntegerState {
    fun consumeCharacter(char: String, integerVerifier: IntegerVerifier)

}