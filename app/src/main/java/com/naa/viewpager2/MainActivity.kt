package com.naa.viewpager2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.naa.viewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , PagerCommunicator {

    private lateinit var adapter: ExamplePagerAdapter
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val data = arrayListOf(
            Color.parseColor(
                "#FF3700B3"
            ),
            Color.parseColor(
                "#FF00EF28"
            ),
            Color.parseColor(
                "#FF3700B3"
            ),
            Color.parseColor(
                "#00FFD9"
            ),
            Color.parseColor(
                "#FFFFE100"
            ),
        )
        adapter = ExamplePagerAdapter(data , this)

        binding.pager.adapter = adapter

        TabLayoutMediator(binding.tablayout, binding.pager){
            tab, position ->
            tab.text = "Selected $position"
        }.attach()
    }

    override fun onClick(color: Int) {
        title = "Title $color "
    }
}