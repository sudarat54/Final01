package com.example.final01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Calculate.setOnClickListener {


            if (rdo1.isChecked == false && rdo2.isChecked == false && rdo3.isChecked == false && rdo4.isChecked == false && rdo5.isChecked == false) {
                Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
            } else if (radio2.isChecked == false && radio1.isChecked == false) {
                Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
            } else if (Height.text.toString() == "" || Age.text.toString() == "" || Weight.text.toString() == "") {
                Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
            } else {
                var txt1 = Weight.text.toString().toDouble()
                var txt2 = (Height.text.toString().toDouble() * 0.01)
                var txt3 = (txt1.toDouble() / Math.pow(txt2.toDouble(), 2.0))
                var txt4 = Age.text.toString().toDouble()

                var m: Double = 0.0
                var n = 0.0
                if (radio1.isChecked) {
                    m = (66 + (13.7 * Weight.text.toString()
                        .toDouble()) + (5 * Height.text.toString().toDouble()) - (6.8 * txt4))
                } else if (radio2.isChecked) {
                    m = (665 + (9.6 * Weight.text.toString()
                        .toDouble()) + (1.8 * Height.text.toString().toDouble()) - (4.7 * txt4))
                }

                if (rdo1.isChecked) {
                    n = (m.toDouble() * 1.2)
                } else if (rdo2.isChecked) {
                    n = (m.toDouble() * 1.375)
                } else if (rdo3.isChecked) {
                    n = (m.toDouble() * 1.55)
                } else if (rdo4.isChecked) {
                    n = (m.toDouble() * 1.725)
                } else if (rdo5.isChecked) {
                    n = (m.toDouble() * 1.9)
                }


            }

        }


        Clear.setOnClickListener {
            RDG.clearCheck()
            radioGroup.clearCheck()
            Weight.text.clear()
            Height.text.clear()
            Age.text.clear()
        }

    }


}
