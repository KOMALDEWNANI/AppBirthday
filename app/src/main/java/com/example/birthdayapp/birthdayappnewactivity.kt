package com.example.birthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthdayappnewactivity.*

class birthdayappnewactivity : AppCompatActivity() {
    companion object{
        const val Name_Extra="name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdayappnewactivity)
        val name=intent.getStringExtra(Name_Extra)
        show_greet.text="Happy Birthday \n $name !!"
    }
}