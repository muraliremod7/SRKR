package com.srkr.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class DailActivity : AppCompatActivity() {
    lateinit var mobileNumber:EditText
    lateinit var call:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dail)
        mobileNumber = findViewById(R.id.idDailEdtPhone)
        call = findViewById(R.id.idDailBtn)

        call.setOnClickListener {
            var mobileNum = mobileNumber.text.toString()
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + mobileNum)
            startActivity(dialIntent)
        }
    }
}