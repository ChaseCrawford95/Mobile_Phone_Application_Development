package com.cchase95.project_1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Sign_In_Page: AppCompatActivity() {
    override fun onCreate(savedInstantState: Bundle?){
        super.onCreate(savedInstantState)
        setContentView(R.layout.sign_in_page_layout)

        val back_button = findViewById<View>(R.id.back_button)

        back_button.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}