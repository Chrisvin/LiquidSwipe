package com.jem.liquidswipe.layout

import android.content.Context
import android.util.AttributeSet
import com.jem.easyreveal.layouts.EasyRevealLinearLayout
import com.jem.liquidswipe.clippathprovider.LiquidSwipeClipPathProvider
import com.jem.liquidswipe.base.LiquidSwipeLayout

class LiquidSwipeLinearLayout : EasyRevealLinearLayout,
    LiquidSwipeLayout {

    constructor(context: Context?) : super(context) {
        initialize()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        initialize()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initialize()
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        initialize()
    }

    private fun initialize() {
        clipPathProvider = LiquidSwipeClipPathProvider()
    }
}