package com.cupelli.premiereclasse

import android.os.Build

fun listArray()
{
    val myArray = arrayOf(0,1,2)
    myArray[0]
    myArray.get(0)
    myArray[0] = 1
    myArray[4] = 4

    val myIntArray = intArrayOf(0,1,2)

    "Hola".toCharArray()

    val myMutableArray = arrayListOf<Int>(0,1,2,3,4,5)
    myMutableArray.add(0)
    myMutableArray.remove(0)
    myMutableArray[0] = 23

    val myList = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13)
    myList.add(0)
    myList.add(0,1)
    myList.addAll(myMutableArray)
    myList.removeAt(0)
    myList[0] = 1

    //Region For, While, DoWhile

    for(num in 0..10){
        val numPlusOne = num + 1
    }

    for ((valor,index) in myArray.withIndex())
    {
        valor
        index
    }

    //Esta es una forma de resumir el primer for. Más elegante y preciso
    // myList.forEach()

    myList.forEachIndexed {
        index, valor ->
    }

        //Si pones _, en vez de index, lo toma en cuenta a que el parámetro no va a ser utilizado, a pesar de recibirse
    mutableListOf("H","O","L","A").forEachIndexed{index, valor ->
        index
        valor
    }

    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        myList.removeIf{
            it < 0
        }

        myList.last{it<0}
        myList.first{it==10}

        myList.filter { it<10 }
        myList.filterNot { it<10 }

        myList.contains(1)
        myList.subList(0,10)
    } else
    {
        myList.forEachIndexed { index, i ->
            if(i<0) myList.removeAt(index)
        }
    }

    while(myList.size > 1) {
        myList.removeFirst()
    }

    do{
        myList.removeFirst()
    } while(myList.size > 1)

    //endregion
}

fun maps() {
    val myMap: Map<String, Int> = mapOf("Edad1" to 10, "Edad2" to 20)
    myMap //Edad 1 = 10, Edad2 = 20

    //Key = Id, Value = Username
    val myMutableMap = mutableMapOf<Int, String>(100 to "Rodrigo", 200 to "Alan", 300 to "Amparo")
    myMutableMap // {100 = Rodrigo . . .}

    myMutableMap[400] = "Johan"
    myMutableMap.put(400, "Eli")

    myMutableMap[400] = "Eli"
    myMutableMap.put(400, "Elizabeth")

    myMutableMap[300]
    myMutableMap.get(300) //Amparo

    myMutableMap.remove(200)

    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        myMutableMap.forEach{id, valor ->

        }
    }

    myMutableMap.forEach{
        it.key // 100 .. 500
        it.value //Rodrigo, Amparo
    }
}