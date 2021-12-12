package com.example.chapter4

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class first : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage)

        findViewById<Button>(R.id.btn_choice).setOnClickListener()
        {
            val intent = Intent(this, food ::class.java )               //換頁
            startActivityForResult(intent, 1 )
        }

    }

        }


