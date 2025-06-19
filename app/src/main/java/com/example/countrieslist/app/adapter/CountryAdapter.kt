package com.example.countrieslist.app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.countrieslist.R
import com.example.countrieslist.domain.model.Country

class CountryAdapter (private val countries: List<Country>) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.country_item, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = countries[position]
        holder.nameTextView.text = country.name
        holder.regionTextView.text = country.region
        holder.codeTextView.text = country.code
        holder.capitalTextView.text = country.capital
    }

    override fun getItemCount(): Int {
        return countries.size
    }

    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val regionTextView: TextView = itemView.findViewById(R.id.regionTextView)
        val codeTextView: TextView = itemView.findViewById(R.id.codeTextView)
        val capitalTextView: TextView = itemView.findViewById(R.id.capitalTextView)
    }

}