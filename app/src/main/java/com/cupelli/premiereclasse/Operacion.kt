package com.cupelli.premiereclasse


fun test()
{
    val const = 0 //Es una constante, no puede cambiar

    var change = 0 //Es un dato variable

    var myInt: Int
    var myDouble: Double
    var myLong: Long
    var any: Any
    val Nombre: String
}


fun add(a: Int, b: Int): Int {
    return a+b
}

class Cosa
{
    fun substract(a: Int, b: Int): Int {
        return a - b
    }
}

fun myFun()
{
    var myVar: Int
    var myVar2: Int? = null

    if(myVar2 != null) { }
    else { }

    myVar2?.let{
        val myInt = it + 1
    }

    val myString: String? = null
    myString?.let {

    }

    //?: Es el operador Elvis

    val myResult = myVar2?:0
    val myResult2 = myString?:"Lelele"

}

fun concatenate(myText: String) = "This is your final text: $myText"

class Usuario {
    var id: Int = 0
    //O puedes concatenar funciones

    fun myFun(): String
    {
        return ""
    }
}

fun concatenate2(usuario: Usuario) = "This is your final text: ${usuario.myFun()}"

//region WHEN

val myString = "Salut"

val myMessage = when(myString) {
    "Hola" -> {}
    "Adios" -> { }
    else -> {}

}


