package com.example.desafiodsm02t.activities

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.desafiodsm02t.R

open class Menu: AppCompatActivity() {
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.view_app1 -> {
              val intent = Intent(this, App1::class.java)
                startActivity(intent)
                true
            }
            R.id.view_app2 -> {
                val intent = Intent(this, App2::class.java)
                startActivity(intent)
                true
            }
            R.id.view_app3 -> {
                val intent = Intent(this, App3::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}