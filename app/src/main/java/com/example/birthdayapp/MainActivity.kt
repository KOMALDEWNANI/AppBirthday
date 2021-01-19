package com.example.birthdayapp
import android.app.PendingIntent.getActivity
import kotlinx.android.synthetic.main.activity_main.*

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun show_card(view: View) {
        val name=get_user_name.editableText.toString()
        if(name.isEmpty()){
            Toast.makeText(this,"Enter a name",Toast.LENGTH_LONG).show()

    }
        else{

        val intent= Intent(this,birthdayappnewactivity::class.java)
        intent.putExtra(birthdayappnewactivity.Name_Extra,name)
        startActivity(intent)
    }
}}