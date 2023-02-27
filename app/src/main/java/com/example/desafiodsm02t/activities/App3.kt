package com.example.desafiodsm02t.activities

import com.example.desafiodsm02t.R
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.core.view.get
import com.example.desafiodsm02t.classes.app3.Calculator

class App3: Menu() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app3)
        val button = findViewById<Button>(R.id.btnApp3)
        val resulttv = findViewById<TextView>(R.id.tvResultApp3)

        var spinnerSelected  = ""
        val operaciones = arrayOf("+", "-", "x", "/")
        val spinner: Spinner = findViewById(R.id.spinner)
        val arrayAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_item, operaciones)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                spinnerSelected = operaciones[p2]
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
        button.setOnClickListener{
            val num1 = findViewById<EditText>(R.id.txtnum1).text.toString().toDouble()
            val num2 = findViewById<EditText>(R.id.txtnum2).text.toString().toDouble()
            val result = Calculator(num1,num2,spinnerSelected).getResult()
            resulttv.text = "El resultado es ${result}"
        }
    }

}