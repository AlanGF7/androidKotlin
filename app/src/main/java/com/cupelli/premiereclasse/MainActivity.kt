package com.cupelli.premiereclasse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var myVar = "Salut, comment ça va?"
        //val myFinalValue = if (myRandom < 0) null else myRandom
        //Toast.makeText(this, myVar, Toast.LENGTH_SHORT).show()

        val myRandom = Random.nextInt(-10, 110)
        myToast(myRandom)

    }
    fun myToast(myFinal: Int)
    {
        //0 a 10 = Tu entero es: Int
        //10 a 50 = Tu entero es mayor a 9 pero menor de 51, es: Int
        //51 a 100 = (60) Tu entero está entre 59 y 61
        // null -> Tu parámetro es nulo

        val final = when{
            myFinal < 0 -> "Tu parámetro es nulo"
            myFinal in 0..10 -> "Tu entero es: $myFinal"
            myFinal in 11..50 -> "Tu entero es mayor a 9 y menor que 51, es: $myFinal"
            myFinal in 51..100 -> "Tu entero está entre ${myFinal - 1} y ${myFinal + 1}, es: $myFinal"
            else -> "Tu parámetro es nulo"
        }
        Toast.makeText(this, final, Toast.LENGTH_SHORT).show()
    }

    fun sendMessage(view: View) {
        val myRandom = Random.nextInt(-10, 110)
        myToast(myRandom)
    }
}