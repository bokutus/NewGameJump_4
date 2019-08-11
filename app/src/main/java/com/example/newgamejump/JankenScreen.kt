package com.example.newgamejump

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_janken_screen.*

class JankenScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_janken_screen)

        gu.setOnClickListener{onYourHandButtonTapped(it)}
        choki.setOnClickListener{onYourHandButtonTapped(it)}
        pa.setOnClickListener{onYourHandButtonTapped(it)}
    }

    fun onYourHandButtonTapped(view: View?) {
        val intent = Intent(this, JankenResult::class.java)
        intent.putExtra("My_Hand", view?.id)
        startActivity(intent)
    }


}
