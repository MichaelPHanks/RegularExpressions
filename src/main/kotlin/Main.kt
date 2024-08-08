package org.example

fun main() {
    println("Hello World!")


    var verifier = IntegerVerifier()

    println(verifier.verify("1234"))
    println(verifier.verify("0234"))
    println(verifier.verify("1234as"))
    println(verifier.verify("a12s34"))
}