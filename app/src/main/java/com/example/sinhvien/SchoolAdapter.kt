package com.example.sinhvien

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CountryRVAdapter(val context: Context, val countrySource:List<SchoolInfo>)
    : RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.row_item_country,
            parent,false))
    }
    override fun getItemCount(): Int {
        return countrySource.count()
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTV.text = countrySource[position].name
        holder.positionTV.text = countrySource[position].position
        holder.detail.text = countrySource[position].detail
        holder.imgIV.setImageResource(countrySource[position].flag)
    }

}
class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val imgIV = view.findViewById<ImageView>(R.id.imgTV)
    val nameTV = view.findViewById<TextView>(R.id.nameTV)
    val positionTV = view.findViewById<TextView>(R.id.positionTV)
    val detail = view.findViewById<TextView>(R.id.detailTV)
}