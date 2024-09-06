package com.example.poo

open class Person(var name: String = "Anonimo", var passport: String? = null) {
    var alive: Boolean = true

    fun Person(){
        name = "Juan"
        passport = "B781354"
    }

    fun die(){ alive = false }

    }
class Athlete(name: String, passport: String?, var sport: String): Person(name, passport)