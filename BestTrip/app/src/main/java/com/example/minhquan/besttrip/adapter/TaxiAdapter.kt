package com.example.minhquan.besttrip.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

import com.example.minhquan.besttrip.R
import com.example.minhquan.besttrip.model.datafirebase.Company

import java.util.ArrayList

class TaxiAdapter(internal var context: Context) : RecyclerView.Adapter<TaxiAdapter.ViewHolder>() {
    internal var data: List<Company>
    private lateinit var company: Company

    init {

        data = ArrayList()
    }

    fun setData(data: List<Company>) {
        this.data = data
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.taxi, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        company = data[position]
        //holder.imageAutoMakers.setImageResource(R.drawable.grab_logo);
        holder.tvAutoMakers.text = company.name
        holder.tvPrice.text = company.listUser[0].price
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        internal var imageAutoMakers: ImageView = itemView.findViewById(R.id.imgAutoMakers)
        internal var tvAutoMakers: TextView = itemView.findViewById(R.id.tvAutoMakers)
        internal var tvPrice: TextView = itemView.findViewById(R.id.tvPrice)

        init {

            itemView.setOnClickListener(this)

        }

        override fun onClick(v: View) {
            Toast.makeText(context, "Clicked!!!", Toast.LENGTH_SHORT).show()
        }
    }
}