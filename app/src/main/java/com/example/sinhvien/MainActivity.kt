package com.example.sinhvien

import android.annotation.SuppressLint
import android.graphics.Color.WHITE
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val countrySource = listOf<CountryInfo>(
        CountryInfo("Mai Tan Hung","11.11.2000","abc",R.drawable.profile),
        CountryInfo("Nguyen Van Loc","02.11.2000","abc",R.drawable.loc_1),
        CountryInfo("Nguyen Van D","1.12.2000","abc",R.drawable.videofilmer),
        CountryInfo("Nguyen Tu Van","16.01.2000","abc",R.drawable.videofilmer),
        CountryInfo("Nguyen Van C","1.11.2000","abc",R.drawable.videofilmer),
        CountryInfo("Nguyen Van B","1.11.2000","abc",R.drawable.weiem)
    )
    //run
        @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countryRecyclerView = findViewById<RecyclerView>(R.id.countryRV)
        val countryAdapter = CountryRVAdapter(this,countrySource)
        countryRecyclerView.layoutManager = GridLayoutManager(this,2)
        countryRecyclerView.adapter = countryAdapter
        findViewById<Button>(R.id.changeColor).setOnClickListener(){
            countryRecyclerView.setBackgroundColor(R.color.colorPrimaryDark)
        }
        findViewById<Button>(R.id.backColor).setOnClickListener(){
            countryRecyclerView.setBackgroundColor(R.color.white)
        }
    }


}