package com.elcodee.basicdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.elcodee.basicdatabinding.databinding.ActivityProgressBarBinding

class ProgressBar : AppCompatActivity() {
    private lateinit var binding : ActivityProgressBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_progress_bar)
        binding.controlButton.setOnClickListener {
            startOrStopProgressBar()
        }
    }

    private fun startOrStopProgressBar() {
        binding.apply {
            if (progressBar.visibility == View.GONE) {
                progressBar.visibility = View.VISIBLE
                controlButton.text = "Stop"
            } else {
                progressBar.visibility = View.GONE
                controlButton.text = "Start"
            }
        }
    }
}