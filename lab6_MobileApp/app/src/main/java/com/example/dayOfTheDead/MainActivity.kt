package com.example.dayOfTheDead

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun letsCelebrate(view: View) {
        //EditText
        val editName = findViewById<EditText>(R.id.editTextName)
        val name = editName.text

        //TextView
        val booText = findViewById<TextView>(R.id.textMessage)
        booText.text = "¡Feliz Dia De Los Muertos, " + name + "!"

        //ImageView
        val imageGhost = findViewById<ImageView>(R.id.imageView)
        imageGhost.setImageResource(R.drawable.muerto)
    }
}