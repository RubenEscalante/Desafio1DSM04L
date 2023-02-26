package com.example.desafiodsm02t.activities

import com.example.desafiodsm02t.R
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.desafiodsm02t.classes.app2.Salary

class App2: Menu() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app2)

        val button = findViewById<Button>(R.id.btnApp2)
        val result = findViewById<TextView>(R.id.tvResultApp2)

        button.setOnClickListener{
            val name = findViewById<EditText>(R.id.txtNameApp2).text.toString()
            val salary = findViewById<EditText>(R.id.txtSalaryApp2).text.toString().toDouble()
            val netsalary = Salary(salary).getNetSalary()
            result.text = "Su salario neto ${name} es ${netsalary}"
        }

    }
}