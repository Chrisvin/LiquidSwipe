package com.jem.liquidswipe

import android.view.View
import androidx.viewpager.widget.ViewPager
import com.jem.easyreveal.RevealLayout
import kotlin.math.abs

class LiquidSwipePageTransformer : ViewPager.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        if (page is RevealLayout) {
            when {
                position < -1 -> {
                    page.revealForPercentage(0f, false)
                }
                position < 0 -> {
                    page.translationX = -(page.width * position)
                    page.revealForPercentage(100 - abs(position * 100), false)
                }
                position <= 1 -> {
                    page.revealForPercentage(100f, false)
                    page.translationX = -(page.width * position)
                }
            }
        }
    }
}