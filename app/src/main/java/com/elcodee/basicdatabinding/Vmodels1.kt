package com.elcodee.basicdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.elcodee.basicdatabinding.ViewModels.Vm1
import com.elcodee.basicdatabinding.ViewModels.VmFactory
import com.elcodee.basicdatabinding.databinding.ActivityVmodels1Binding

class Vmodels1 : AppCompatActivity() {
    private lateinit var viewModel: Vm1
    private lateinit var viewModelFactory: VmFactory
    private lateinit var binding: ActivityVmodels1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVmodels1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModelFactory = VmFactory(120)
        viewModel = ViewModelProvider(this, viewModelFactory)[Vm1::class.java]

//        livedata
        viewModel.totalData.observe(this, Observer {
            binding.resultTextView.text = it.toString()
        })

//        viewModel
        binding.apply {
//            resultTextView.text = viewModel.getTotal().toString()
            insertButton.setOnClickListener {
                viewModel.setTotal(inputEditText.text.toString().toInt())
//                resultTextView.text = viewModel.getTotal().toString()
            }
        }

    }
}