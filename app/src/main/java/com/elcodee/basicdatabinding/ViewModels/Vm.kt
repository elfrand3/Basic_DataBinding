package com.elcodee.basicdatabinding.ViewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Vm: ViewModel() {
//    private var count = 0
    var count = MutableLiveData<Int>()

    init {
        count.value = 0
    }

    fun updateCount(){
        count.value =(count.value)?.plus(1)
    }

//    fun getCurCount():Int{
//        return count
//    }
//    fun getUpdateCount():Int{
//        return ++count
//    }
}