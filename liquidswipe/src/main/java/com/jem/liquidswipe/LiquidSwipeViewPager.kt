package com.jem.liquidswipe

import android.content.Context
import android.util.AttributeSet
import android.view.animation.DecelerateInterpolator
import androidx.viewpager.widget.ViewPager

class LiquidSwipeViewPager : ViewPager {
    constructor(context: Context) : super(context) {
        initialize(context, null)
    }
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initialize(context, attrs)
    }

    private fun initialize(context: Context, attrs: AttributeSet?) {
        val mScroller = ViewPager::class.java.getDeclaredField("mScroller")
        mScroller.isAccessible = true
        val scroller = FixedSpeedScroller(context, DecelerateInterpolator())
        mScroller.set(this, scroller)

        setPageTransformer(true, LiquidSwipePageTransformer())


    }
}