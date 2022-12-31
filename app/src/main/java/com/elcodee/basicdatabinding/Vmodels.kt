package com.elcodee.basicdatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.elcodee.basicdatabinding.ViewModels.Vm
import com.elcodee.basicdatabinding.databinding.ActivityVmodelsBinding

class Vmodels : AppCompatActivity() {
//    private var count = 0
    private lateinit var viewModel: Vm
    private lateinit var binding: ActivityVmodelsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVmodelsBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.countText.text = count.toString()
//        binding.button.setOnClickListener {
//            count++
//            binding.countText.text = count.toString()
//        }
        viewModel = ViewModelProvider(this)[Vm::class.java]

//        liveData
        viewModel.count.observe(this, Observer {
            binding.countText.text = it.toString()
        })


        binding.apply {
//            pindah ke activity Vmodel1
            idVmodels1.setOnClickListener { startActivity(Intent(this@Vmodels, Vmodels1::class.java)) }

//            isinya
//            countText.text = viewModel.getCurCount().toString()
            button.setOnClickListener {
                viewModel.updateCount()
//                countText.text = viewModel.getUpdateCount().toString()
            }
        }
    }
}