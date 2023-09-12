package com.cchase95.project_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<View>(R.id.button1)
        val button2 = findViewById<View>(R.id.button2)
        val button3 = findViewById<View>(R.id.button3)
        val button4 = findViewById<View>(R.id.button4)

        button1.setOnClickListener(){
            val intent = Intent(this, Sign_In_Page::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener(){

        }
        button3.setOnClickListener(){

        }
        button4.setOnClickListener(){

        }
    }
}