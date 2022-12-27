package com.elcodee.basicdatabinding.ViewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Vm1(startingTotal: Int): ViewModel() {
//    dr viewModel
//    private var total = 0

//    liveData
    private var total = MutableLiveData<Int>()
    val totalData: LiveData<Int>
    get() = total

    init {
//        total = startingTotal

        total.value = startingTotal
    }
//    fun getTotal():Int{
//        return total
//    }
//
//    fun setTotal(input:Int){
//        total +=input
//    }
    fun setTotal(input:Int){
        total.value = (total.value)?.plus(input)
    }
}