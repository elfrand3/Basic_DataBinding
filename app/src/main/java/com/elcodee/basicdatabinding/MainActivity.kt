package com.elcodee.basicdatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.elcodee.basicdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.apply {
            idProgressBar.setOnClickListener { startActivity(Intent(this@MainActivity, ProgressBar::class.java)) }
            idObject.setOnClickListener { startActivity(Intent(this@MainActivity, Object::class.java)) }
            idVmodels.setOnClickListener { startActivity(Intent(this@MainActivity, Vmodels::class.java)) }
            submitButton.setOnClickListener {
                greetingTextView.text = "Hello! "+ nameEditText.text
//                displayGreeting()
            }
        }
    }
//    private fun displayGreeting() {
//        binding.apply {
//            greetingTextView.text = "Hello! " + nameEditText.text
//        }
//    }
}