package com.example.wthr_app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.wthr_app.R
import com.example.wthr_app.R.layout
import com.example.wthr_app.databinding.ListItemBinding
import java.lang.reflect.Type
import java.text.FieldPosition

class WeatherAdapter:ListAdapter<WeatherModel,WeatherAdapter.Holder>() {
    class Holder(view: View):RecyclerView.ViewHolder(view) {
        val binding= ListItemBinding.bind(view)

        fun bind(item:WeatherModel)=with(binding){
            itemDate.text=item.date
            itemMax.text=item.max_temp
            itemMin.text=item.min_temp
        }
    }
    class Comparator: DiffUtil.ItemCallback<WeatherModel>(){
        override fun areItemsTheSame(oldItem: WeatherModel, newItem: WeatherModel): Boolean {
            return oldItem==newItem
        }

        override fun areContentsTheSame(oldItem: WeatherModel, newItem: WeatherModel): Boolean {
            return oldItem==newItem
        }

    }

    fun onCreateViewHolder(parent: ViewGroup,viewType: Int):Holder {
        val view=LayoutInflater.from(parent.context).inflate(layout.list_item,parent)
        return Holder(view)
    }
    fun onBindViewHolder(holder: Holder,position: Int){
        holder.bind(getItem(position))
    }

}