package com.example.cwifinancialtrackerproject.ui.income

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class IncomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the Income Fragment"
    }
    val text: LiveData<String> = _text
}