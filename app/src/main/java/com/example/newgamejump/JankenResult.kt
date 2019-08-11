package com.example.newgamejump

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_janken_result.*
import android.content.Intent
import android.view.View


class JankenResult : AppCompatActivity() {

    val gu = 0
    val choki = 1
    val pa = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_janken_result)
        val id = intent.getIntExtra("My_Hand",0)

        val myHand: Int
        myHand = when(id) {
            R.id.gu -> {
                myHandImage.setImageResource(R.drawable.gu)
                gu
            }
            R.id.choki -> {
                myHandImage.setImageResource(R.drawable.choki)
                choki
            }
            R.id.pa -> {
                myHandImage.setImageResource(R.drawable.pa)
                pa
            }
            else -> gu
        }

        val cpuHand = (Math.random() * 3 ).toInt()
        when(cpuHand) {
            gu -> cpuHandImage.setImageResource(R.drawable.gu)
            choki -> cpuHandImage.setImageResource(R.drawable.choki)
            pa -> cpuHandImage.setImageResource(R.drawable.pa)
        }

        val jankenGameResult = (cpuHand - myHand + 3) % 3
        when(jankenGameResult) {
            0 -> myFaceImage.setImageResource(R.drawable.aiko)
            1 -> myFaceImage.setImageResource(R.drawable.make)
            2 -> myFaceImage.setImageResource(R.drawable.kati)
        }
        when(jankenGameResult) {
            0 -> cpuFaceImage.setImageResource(R.drawable.aiko)
            1 -> cpuFaceImage.setImageResource(R.drawable.kati)
            2 -> cpuFaceImage.setImageResource(R.drawable.make)
        }

        backButton.setOnClickListener{onBackButtonTapped(it)}
    }

    fun onBackButtonTapped(view: View?){
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }
}

