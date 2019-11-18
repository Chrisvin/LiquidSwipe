package com.jem.liquidswipe.util

import android.content.Context
import android.view.animation.Interpolator
import android.widget.Scroller

internal class FixedSpeedScroller : Scroller {

    var scrollerDuration = 1000

    constructor(context: Context?, interpolator: Interpolator?) : super(context, interpolator)
    constructor(context: Context?, interpolator: Interpolator?, duration: Int) : this(
        context,
        interpolator
    ) {
        this.scrollerDuration = duration
    }

    constructor(context: Context?, interpolator: Interpolator?, flywheel: Boolean) : super(
        context,
        interpolator,
        flywheel
    )

    override fun startScroll(
        startX: Int,
        startY: Int,
        dx: Int,
        dy: Int,
        duration: Int
    ) { // Ignore received duration, use fixed one instead
        super.startScroll(startX, startY, dx, dy, this.scrollerDuration)
    }

    override fun startScroll(
        startX: Int,
        startY: Int,
        dx: Int,
        dy: Int
    ) { // Ignore received duration, use fixed one instead
        super.startScroll(startX, startY, dx, dy, scrollerDuration)
    }
}