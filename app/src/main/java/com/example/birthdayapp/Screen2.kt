package com.example.birthdayapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
    }

    fun enter_getname(view: View) {
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
        }

    fun song_website(view: View) {
        val webIntent: Intent = Uri.parse("https://birthdaysong.in/").let { webpage ->
            Intent(Intent.ACTION_VIEW, webpage)
    }
        startActivity(webIntent)
}

    fun open_youtube(view: View) {
        val webIntent: Intent =
            Uri.parse("https://www.youtube.com/watch?v=GbdOBiaKfwk").let { webpage ->
                Intent(Intent.ACTION_VIEW, webpage)
            }

        startActivity(webIntent)
    }}