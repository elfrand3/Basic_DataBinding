package com.elcodee.basicdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.elcodee.basicdatabinding.databinding.ActivityObjectBinding

class Object : AppCompatActivity() {
    private lateinit var binding: ActivityObjectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_object)
//        val student = getStudent()
//        binding.nameText.text = student.name
//        binding.emailText.text = student.email

        binding.student = getStudent()
    }

    data class Student (
        var id: Int,
        var name: String,
        var email: String,
    )

    private fun getStudent():Student {
        return Student(1,"El","el@gmail.com")
    }
}