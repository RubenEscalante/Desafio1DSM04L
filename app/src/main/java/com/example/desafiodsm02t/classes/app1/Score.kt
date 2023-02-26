package com.example.desafiodsm02t.classes.app1

class Score(private val scores: LongArray) {

    fun value(position: Int): Long{
        return scores[position]
    }

    fun average(): Long{
        return scores.average().toLong()
    }

    fun validation(): String{
       val validation = if (average() < 6){
            "Reprobado"
        } else{
            "Aprobado"
        }
        return validation
    }

}