package com.example.wthr_app.layer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wthr_app.R

class HourFragment : Fragment() {
    private lateinit var binding:HourFragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=HourFragment()
    }

    companion object {

        @JvmStatic
        fun newInstance() =HourFragment()


            }

}