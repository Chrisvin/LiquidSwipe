package com.jem.liquidswipe

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.animation.DecelerateInterpolator
import androidx.viewpager.widget.ViewPager
import com.jem.liquidswipe.base.LiquidSwipeLayout
import com.jem.liquidswipe.util.FixedSpeedScroller
import kotlin.math.abs

class LiquidSwipeViewPager : ViewPager {
    constructor(context: Context) : super(context) {
        initialize(context, null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initialize(context, attrs)
    }

    private fun initialize(context: Context, attrs: AttributeSet?) {
        setPageTransformer(true, LiquidSwipePageTransformer())

        var scrollerDuration = DEFAULT_SCROLLER_DURATION
        attrs?.let {
            val typedArray =
                context.obtainStyledAttributes(it, R.styleable.LiquidSwipeViewPager, 0, 0)
            typedArray.apply {
                scrollerDuration = getInt(
                    R.styleable.LiquidSwipeViewPager_scrollerDuration,
                    DEFAULT_SCROLLER_DURATION
                )
            }
        }
        setDuration(scrollerDuration)
    }

    public fun setDuration(duration: Int) {
        val mScroller = ViewPager::class.java.getDeclaredField("mScroller")
        mScroller.isAccessible = true
        val scroller = FixedSpeedScroller(context, DecelerateInterpolator())
        scroller.scrollerDuration = duration
        mScroller.set(this, scroller)
    }

    companion object {
        private const val DEFAULT_SCROLLER_DURATION = 1000
    }

    class LiquidSwipePageTransformer : ViewPager.PageTransformer {
        override fun transformPage(page: View, position: Float) {
            if (page is LiquidSwipeLayout) {
                when {
                    position < -1 -> {
                        page.revealForPercentage(0f)
                    }
                    position < 0 -> {
                        page.translationX = -(page.width * position)
                        page.revealForPercentage(100 - abs(position * 100))
                    }
                    position <= 1 -> {
                        page.revealForPercentage(100f)
                        page.translationX = -(page.width * position)
                    }
                }
            }
        }
    }
}