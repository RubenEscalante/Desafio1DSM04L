package com.example.desafiodsm02t.classes.app2

class Salary(private val salary_: Double) {

    fun getISSS():Double{
    return salary_ * 0.03
    }

    fun getAFP():Double{
        return salary_ * 0.04
    }

    fun getRent():Double{
    return salary_ * 0.05
    }

    fun getNetSalary():Double{
        return (salary_ - getISSS() - getAFP() - getRent())
    }
}