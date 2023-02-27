package com.example.desafiodsm02t.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.desafiodsm02t.R
import com.example.desafiodsm02t.classes.general.User
import com.google.android.material.color.utilities.Score

class App1: Menu() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app1)

        val button = findViewById<Button>(R.id.btnApp1)

        button.setOnClickListener {
            val name = findViewById<EditText>(R.id.txtName)
            val lastname = findViewById<EditText>(R.id.txtLastName)
            val result = findViewById<TextView>(R.id.tvResult)
            var arrayScr = LongArray(5)
            arrayScr[0] = findViewById<EditText>(R.id.txtScore1).text.toString().toLong()
            arrayScr[1] = findViewById<EditText>(R.id.txtScore2).text.toString().toLong()
            arrayScr[2] = findViewById<EditText>(R.id.txtScore3).text.toString().toLong()
            arrayScr[3] = findViewById<EditText>(R.id.txtScore4).text.toString().toLong()
            arrayScr[4] = findViewById<EditText>(R.id.txtScore5).text.toString().toLong()

            val userApp1 = User(name.text.toString(), lastname.text.toString())
            val scoreAvg = com.example.desafiodsm02t.classes.app1.Score(arrayScr)

            result.text = "Resultado para: ${userApp1.fullName()} \n Nota promedio: ${scoreAvg.average()} El alumno ha ${scoreAvg.validation()}"
        }

    }


}