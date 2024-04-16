package com.example.wthr_app

import android.os.Parcel
import android.os.Parcelable

data class MData(
    val city:String,
    val time:String,
    val current_temp:String,
    val max_temp:String,
    val min_temp:String,
    val hours:String

)