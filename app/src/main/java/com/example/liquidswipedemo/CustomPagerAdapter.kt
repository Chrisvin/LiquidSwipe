package com.example.liquidswipedemo

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.jem.easyreveal.RevealLayout
import com.jem.liquidswipe.LiquidSwipeClipPathProvider

class CustomPagerAdapter(private val context: Context) : PagerAdapter() {

    private val colorArray: ArrayList<Int> = arrayListOf(Color.BLUE, Color.GREEN, Color.MAGENTA, Color.CYAN, Color.YELLOW, Color.RED)
    private val titleArray: ArrayList<String> = arrayListOf(
        "Page 1",
        "Page 2",
        "Page 3",
        "Page 4",
        "Page 5",
        "Page 6"
    )

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(context)
        val layout = inflater.inflate(R.layout.fragment_dummy, container, false);
        layout.findViewById<TextView>(R.id.fragment_textview).text = titleArray[position]
        layout.setBackgroundColor(colorArray[position])
        container.addView(layout)
        return layout
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return `object` == view
    }

    override fun getCount(): Int {
        return titleArray.count()
    }
}