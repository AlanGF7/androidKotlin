package com.cupelli.premiereclasse

/*final -> default
open -> Can be override
abstract -> must be overriden*/

/*open class Animal(name: String)
{
    open var age: Int = 0
    var kind: String = ""
}*/

abstract class Animal(name: String)
{
    abstract var age: Int = 0
    open var kind: String = ""
}

class Dog(name: String) : Animal(name)
{
    override var age: Int
    get() = TODO("Not yet implemented")
    set(value) {}

    fun getAnimalString()
    {
        TODO("Not yet implemented")
    }
}

interface userAPI {
    fun doLogin(user: String)
}

interface IListener {
    fun onClickLogin() {
        var myVar = ""
    }
}

class myLogin : userAPI {
    override fun doLogin(user: String)
    {
        TODO("Not yet implemented")
    }
}

class myClass {
    fun doSomething()
    {
        val myInt = 10
        val result = myInt.sumarYRestar() //19

        //Si ponemos un String no nos permitirá el uso de la extensión sumarYRestar, pues no es un Int
    }

}

fun Int.sumarYRestar(): Int
{
    val suma = this +1 //11
    val restar = this -2 //8

    return suma + restar
}

fun String.toDateFormat(format: String)
{

}

fun String.toMyBoolean()
{

}