package com.example.myfirstandroidapp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle : Bundle? = intent.extras
        val msg = bundle!!.getString("user_message")

        Toast.makeText(this,"message received",Toast.LENGTH_SHORT).show()
        textuser_msg.text = msg

        btn_back.setOnClickListener{
           val intent =  Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}