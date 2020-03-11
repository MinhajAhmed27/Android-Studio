package com.example.myfirstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend.setOnClickListener {

            Log.i("MainActivity", "button was clicked" )

            val message = PlainText.text.toString()

            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
