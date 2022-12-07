package com.krishanshamod.simple_android_application_7.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _text = MutableLiveData<String>().apply {
        value = "Text"
    }

    val text: MutableLiveData<String> = _text

    fun updateText(text: String) {
        _text.value = text
    }

}