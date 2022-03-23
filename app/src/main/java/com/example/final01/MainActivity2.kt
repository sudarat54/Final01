package com.example.final01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val i = intent
        var txt1 = i.getStringExtra("txt1")
        var txt3 = i.getStringExtra("txt2")
        var txt4 = i.getStringExtra("txt3")

        val txt2 = "%,.2f".format(txt1.toString().toDouble())
        BMI.text = "%,.2f".format(txt1.toString().toDouble())

        BMR.text = txt3.toString()
        TDEE.text = txt4.toString()

        if (txt2.toString().toDouble() < 18.59)
            tv1.text = ""
        else if (txt2.toString().toDouble() > 18.59 && txt2.toString().toDouble() < 24.99) {
            tv1.text = ""
        } else if (txt2.toString().toDouble() > 25 && txt2.toString().toDouble() < 29.99) {
            tv1.text = ""
        } else {
            tv1.text = ""
        }


        Back2.setOnClickListener {
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }

}