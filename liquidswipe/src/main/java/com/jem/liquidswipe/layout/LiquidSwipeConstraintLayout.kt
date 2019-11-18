package com.jem.liquidswipe.layout

import android.content.Context
import android.util.AttributeSet
import com.jem.easyreveal.layouts.EasyRevealConstraintLayout
import com.jem.liquidswipe.LiquidSwipeClipPathProvider
import com.jem.liquidswipe.base.LiquidSwipeLayout

open class LiquidSwipeConstraintLayout : EasyRevealConstraintLayout,
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

    private fun initialize() {
        clipPathProvider = LiquidSwipeClipPathProvider()
    }
}