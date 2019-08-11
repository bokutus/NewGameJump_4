package com.example.newgamejump

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_janken.*

class Janken : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_janken)

        startButton.setOnClickListener{ onJankenStartButton(it) }
    }

    fun onJankenStartButton(view: View?) {
        val intent = Intent(this, JankenScreen::class.java)
        startActivity(intent)
    }
}
