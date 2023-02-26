package com.example.desafiodsm02t.classes.general

class User(private val name_: String,private val lastname_: String) {

    fun name(): String{
    return name_
    }

    fun lastName(): String{
    return lastname_
    }

    fun fullName(): String{
    return "${name()} ${lastName()}"
    }

}