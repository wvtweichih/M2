package com.tom

fun main() {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human(weight = 66.5f, height = 1.7f)
    println(h.bmi())
    /*var age  = 19;
    age = 20;
    var weight = 66.5f;
    var name : String;
    name = "Hank";*/

}

class Human(var weight: Float, var height: Float){

    fun bmi() :Float {
        val bmi = weight / (height*height)
        return bmi
    }
    fun hello() {
        println("hello kotlin")
    }

}
