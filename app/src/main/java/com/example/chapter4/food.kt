package com.example.chapter4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import android.widget.*
import android.content.Intent

class food : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)


        findViewById<Button>(R.id.btn_food).setOnClickListener()
        {
            val intent = Intent(this, food::class.java)                    //換頁
            startActivityForResult(intent, 1)
        }
        findViewById<Button>(R.id.btn_drink).setOnClickListener()
        {
            val intent = Intent(this, drink::class.java)
            startActivityForResult(intent, 1)
        }

        ///////////////////////////////////////////////////////////////////
        val tv_name = findViewById<TextView>(R.id.tv_name)
        var num1 = findViewById<EditText>(R.id.ed_num)
        val ibt_increace = findViewById<ImageButton>(R.id.ibt_inc)



        ibt_increace.setOnClickListener()
        {

        }


    }
}