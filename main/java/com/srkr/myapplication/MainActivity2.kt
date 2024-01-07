package com.srkr.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var gotonextscreen1: Button
    lateinit var emailTxt: TextView
    lateinit var passTxt: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        gotonextscreen1 = findViewById(R.id.gotonextscreen1)
        emailTxt = findViewById(R.id.emailText)
        passTxt = findViewById(R.id.mobileText)

        var intent = getIntent()
        var emailtxt = intent.getStringExtra("email")
        var mobiletxt = intent.getStringExtra("mobile")

        emailTxt.text = emailtxt
        passTxt.text = mobiletxt

        gotonextscreen1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}