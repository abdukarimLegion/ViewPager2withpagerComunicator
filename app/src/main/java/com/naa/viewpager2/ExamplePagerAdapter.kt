package com.naa.viewpager2


import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ExamplePagerAdapter(var data: List<Int>, activity: FragmentActivity) :
    FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return data.size
    }

    override fun createFragment(position: Int) = ExampleFragment().putArguments {
        putInt("COLOR", data[position])
    }
}