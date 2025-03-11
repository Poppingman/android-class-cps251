package com.example.oero3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)


        val text = findViewById<EditText>(R.id.editTextText)
        val Addnamebutton = findViewById<Button>(R.id.button)
        val Textdisplaylist = findViewById<TextView>(R.id.textView2)
        val namesList = mutableListOf<String>()

        Addnamebutton.setOnClickListener{

            val name = text.text.toString().trim()

            if (name.isNotEmpty()){
                namesList.add(name)

                Textdisplaylist.text = namesList.joinToString("\n")
                text.text.clear()
            }

        }





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}