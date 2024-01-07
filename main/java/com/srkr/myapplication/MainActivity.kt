package com.srkr.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    lateinit var sendSMS:Button
    lateinit var dail:Button
    lateinit var sendEmail:Button
    lateinit var calculator:Button
    lateinit var sendNotification:Button
    lateinit var sqlite:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Send SMS
        sendSMS = findViewById(R.id.sendSMS)
        sendSMS.setOnClickListener {
                var intent = Intent(applicationContext, SendSMSActivity::class.java)
                startActivity(intent)
        }
        // Dail
        dail = findViewById(R.id.dail)
        dail.setOnClickListener {
            var intent = Intent(applicationContext, DailActivity::class.java)
            startActivity(intent)
        }
        // Send Email
        sendEmail = findViewById(R.id.sendEmail)
        sendEmail.setOnClickListener {
            var intent = Intent(applicationContext, SendEmailActivity::class.java)
            startActivity(intent)
        }
        // Send a Notification
        sendNotification = findViewById(R.id.sendNotification)
        sendNotification.setOnClickListener {
            var intent = Intent(applicationContext, SendNotificationActivity::class.java)
            startActivity(intent)
        }
        // Calculator
        calculator = findViewById(R.id.calculator)
        calculator.setOnClickListener {
            var intent = Intent(applicationContext, CalculatorActivity::class.java)
            startActivity(intent)
        }

        // Sqlite
        sqlite = findViewById(R.id.sqlite)
        sqlite.setOnClickListener {
            var intent = Intent(applicationContext, CalculatorActivity::class.java)
            startActivity(intent)
        }
        }

    }