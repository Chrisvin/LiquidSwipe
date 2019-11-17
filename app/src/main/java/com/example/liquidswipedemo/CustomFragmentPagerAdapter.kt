package com.example.liquidswipedemo

import android.graphics.Color
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class CustomFragmentPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    val colorArray: ArrayList<Int> = arrayListOf(Color.BLUE, Color.GREEN, Color.MAGENTA, Color.CYAN, Color.YELLOW, Color.RED)
    val titleArray: ArrayList<String> = arrayListOf(
        "Page 1",
        "Page 2",
        "Page 3",
        "Page 4",
        "Page 5",
        "Page 6"
        )

    override fun getItem(position: Int): Fragment {
        return DummyFragment.newInstance(colorArray[position], titleArray[position])
    }

    override fun getCount(): Int {
        return titleArray.count()
    }
}