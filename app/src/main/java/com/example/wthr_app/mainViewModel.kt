package com.example.wthr_app

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.wthr_app.adapters.WeatherModel

class mainViewModel:ViewModel() {
    val LDataC=MutableLiveData<WeatherModel>()
    val LLDataC=MutableLiveData<WeatherModel>()


}