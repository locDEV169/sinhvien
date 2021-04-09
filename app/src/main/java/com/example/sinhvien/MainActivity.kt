package com.example.sinhvien

import android.annotation.SuppressLint
import android.graphics.Color.green
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val countrySource = listOf<CountryInfo>(
            CountryInfo("Mai Tan Hung", "11.11.2000", "abc", R.drawable.profile),
            CountryInfo("Nguyen Van Loc", "02.11.2000", "abc", R.drawable.loc_1),
            CountryInfo("Nguyen Nhat Truong", "1.12.2000", "abc", R.drawable.videofilmer),
            CountryInfo("Nguyen Tu Van", "16.01.2000", "abc", R.drawable.videofilmer),
            CountryInfo("Nguyen Van Long", "1.11.2000", "abc", R.drawable.videofilmer)
    )

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countryRecyclerView = findViewById<RecyclerView>(R.id.countryRV)
        val countryAdapter = CountryRVAdapter(this, countrySource)
        countryRecyclerView.layoutManager = GridLayoutManager(this, 2)
        countryRecyclerView.adapter = countryAdapter
        findViewById<Button>(R.id.Changecolor_btn).setOnClickListener{
            countryRecyclerView.setBackgroundColor(ContextCompat.getColor(this, R.color.gray))
        }
        findViewById<Button>(R.id.Changecolor_Btn1).setOnClickListener{
            countryRecyclerView.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        }

    }
}