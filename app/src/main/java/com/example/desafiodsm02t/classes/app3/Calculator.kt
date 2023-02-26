package com.example.desafiodsm02t.classes.app3

class Calculator(val num1: Double, val num2: Double, val operation: String) {
    fun sum(): Double{
        return num1 + num2
    }
    fun resta(): Double{
        return num1 - num2
    }
    fun mul(): Double{
        return num1 * num2
    }
    fun divi(): Double{
        return num1 / num2
    }
    fun getResult():Double{
        var result = 0.0
        when (operation) {
            "+" -> result = sum()
            "-" -> result = resta()
            "x" -> result = mul()
            "/" -> result = divi()
            else -> {
                result = 0.0
            }
        }
        return result
    }

}