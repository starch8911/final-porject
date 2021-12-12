package com.example.chapter4

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class drink : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)


        findViewById<Button>(R.id.btn_food).setOnClickListener()
        {
            val intent = Intent(this, food::class.java)         //換頁
            startActivityForResult(intent, 1)
        }
        findViewById<Button>(R.id.btn_drink).setOnClickListener()
        {
            val intent = Intent(this, drink::class.java)
            startActivityForResult(intent, 1)
        }
    }
}


