package com.example.navigationstack.Adapter

import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationstack.R
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.item_towns.view.*

class RvAdapter(private val listener: RvListener):RecyclerView.Adapter<ViewHolder>() {
    private val list= arrayListOf<Data>()

    override fun getItemCount()=list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_towns,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position],listener)
    }

    fun update(data:ArrayList<Data>){
        list.clear()
        list.addAll(data)
        notifyDataSetChanged()
    }
}

class ViewHolder(view: View):RecyclerView.ViewHolder(view){
     fun bind(list: Data, listener: RvListener){
         itemView.setOnClickListener {
             listener.goToTown(list)
         }
         itemView.tvTitle.text=list.towns
     }
}
@Parcelize
data class Data(
    var towns:String
):Parcelable