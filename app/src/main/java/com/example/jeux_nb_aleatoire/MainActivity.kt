package com.example.jeux_nb_aleatoire

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    val rnds = (0..50).random()


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text= findViewById<EditText>(R.id.textrand)
        val alea :Int
        val random=Random()
        fun rand(from: Int, to: Int) : Int {
            return random.nextInt(to - from) + from
        }
        alea=rand(1,50)
        text.setText(alea)
    }
}