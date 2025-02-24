package com.example.oreo2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        val input = findViewById<EditText>(R.id.editTextNumberDecimal)
        val button = findViewById<Button>(R.id.button2)
        val tip = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            val billAmount = input.text.toString().toDoubleOrNull()

            if (billAmount != null) {
                val tip10 = billAmount * 0.10
                val tip15 = billAmount * 0.15
                val tip20 = billAmount * 0.20

                tip.text = "Tip Amounts:\n10%: $${"%.2f".format(tip10)}\n" +
                        "15%: $${"%.2f".format(tip15)}\n" +
                        "20%: $${"%.2f".format(tip20)}"
            } else {
                tip.text = "You must enter a bill amount"
            }

        }
    }
}