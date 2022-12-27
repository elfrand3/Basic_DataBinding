package com.elcodee.basicdatabinding.ViewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class VmFactory(private val startingTotal: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(Vm1::class.java)){
            return Vm1(startingTotal) as T
        }
        throw IllegalArgumentException("Unknow View Model Class")
    }
}