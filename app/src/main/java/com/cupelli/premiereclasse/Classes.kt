package com.cupelli.premiereclasse

fun testClass() {
    val p = Person("Alan", 19, 1.63)
}

class Person(name: String, var age: Int) {
    init {

    }

    constructor(name: String, age: Int, height: Double) : this(name, age) {
        this.height = height
    }

    var height: Double = 0.0

    var name = name
    get() = "Je m'appelle $field"
    set(value) {
        field = "$value and your height is $height"
    }
}