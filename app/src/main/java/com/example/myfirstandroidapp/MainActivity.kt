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

            Log.i("MainActivity", "button was clicked")

            val message = PlainText.text.toString()

//          Explicit Intent {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message",message)
            startActivity(intent)
//        }
       }
        btn_share.setOnClickListener {
            val message = PlainText.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent,"Share to : "))
        }
        btn_recyclerView.setOnClickListener {
            val intent = Intent(this,HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}
