package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment1=RollFragment()
        val but:Button=findViewById(R.id.play)
        val Quiz:Button=findViewById(R.id.Quiz1)
        but.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frag,fragment1)
                addToBackStack(null) // Add RollFragment to the back stack

                commit()
            }
        }
        Quiz.setOnClickListener{
            val dialog_quiz=QuizDialog()
            dialog_quiz.show(supportFragmentManager,"Quiz")
        }





    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater=menuInflater
        inflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.action_settings->Toast.makeText(this," try to search selected item ",Toast.LENGTH_SHORT).show()
            R.id.action_search->Toast.makeText(this,"try to setting selectd item",Toast.LENGTH_SHORT).show()

        }
        return true;
    }


}