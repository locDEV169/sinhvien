package com.example.sinhvien

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val countrySource = listOf<SchoolInfo>(
            SchoolInfo("THPT Trần phú", "Lê Thánh Tôn", "abc", R.drawable.profile),
            SchoolInfo("THPT Phan Chu Trinh", "Lê Lợi", "abc", R.drawable.weiem),
            SchoolInfo("THPT Thái Phiên", "Trần Cao Vân", "abc", R.drawable.videofilmer),
            SchoolInfo("THPT Lê Quý Đôn", "Sơn Trà", "abc", R.drawable.videofilmer),
            SchoolInfo("THPt Nguyễn Trãi", "Liên Chiểu", "abc", R.drawable.videofilmer),
            SchoolInfo("THPt liên chiểu", "Liên Chiểu", "abc", R.drawable.videofilmer),
            SchoolInfo("THPT Nguyễn hiền", "Phan Đăng Lưu", "abc", R.drawable.videofilmer)

    )
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    @SuppressLint("ResourceAsColor")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val schoolRecyclerView = findViewById<RecyclerView>(R.id.countryRV)
        when(item.itemId){
            R.id.BackgroudColor -> {
                schoolRecyclerView.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_200))
            }
            R.id.DefaultColor -> {
                schoolRecyclerView.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            }
            R.id.About -> {

                Toast.makeText(this, "This is an app show list School", Toast.LENGTH_LONG).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countryRecyclerView = findViewById<RecyclerView>(R.id.countryRV)
        val countryAdapter = CountryRVAdapter(this, countrySource)
        countryRecyclerView.layoutManager = GridLayoutManager(this, 2)
        countryRecyclerView.adapter = countryAdapter

    }
}