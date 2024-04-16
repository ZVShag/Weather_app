package com.example.wthr_app.layer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.FragmentActivity
import com.example.wthr_app.Manifest
import com.example.wthr_app.R
import com.example.wthr_app.adapters.first_adapter
import com.example.wthr_app.databinding.ActivityMainBinding
import com.example.wthr_app.databinding.FragmentFirstBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import java.security.Permission


class first : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private lateinit var pLauncher:ActivityResultLauncher<String>
    private var list= listOf(HourFragment.newInstance(),DayFragment.newInstance())
    private var tablist=listOf("Hour","Day")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        checkPermission()
    }
    private fun permissionListener()
    {
        pLauncher = registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        )
        { Toast.makeText(activity, "Permission is $it", Toast.LENGTH_LONG) }
    }
    private fun init()=with(binding)
    {
        val adapter=first_adapter(activity as FragmentActivity,list)
        vp.adapter=adapter
        TabLayoutMediator(tabLayout,vp){
            tab,pos ->tab.text=tablist[pos]
        }
    }

    private fun TabLayoutMediator()  {

    }

    private fun checkPermission()

    { if(isPermissionGranted(android.Manifest.permission.ACCESS_FINE_LOCATION))
        {
            permissionListener()
            pLauncher.launch(android.Manifest.permission.ACCESS_FINE_LOCATION)
        }
    }
    companion object{
        @JvmStatic
        fun newInstance()=first()
    }

}