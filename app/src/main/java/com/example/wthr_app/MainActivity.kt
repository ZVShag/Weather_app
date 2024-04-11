package com.example.wthr_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wthr_app.layer.first

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.placeholder,first.newInstance()).commit()



    }
}