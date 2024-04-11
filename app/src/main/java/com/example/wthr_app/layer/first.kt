package com.example.wthr_app.layer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.wthr_app.R
import com.example.wthr_app.databinding.ActivityMainBinding
import com.example.wthr_app.databinding.FragmentFirstBinding


class first : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }


    companion object{
        @JvmStatic
        fun newInstance()=first()
    }

}