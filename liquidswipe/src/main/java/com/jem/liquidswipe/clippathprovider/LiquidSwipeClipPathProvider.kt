package com.jem.liquidswipe.clippathprovider

import android.graphics.Path
import android.view.View
import com.jem.liquidswipe.base.ClipPathProvider
import kotlin.math.cos
import kotlin.math.exp
import kotlin.math.pow

/**
 * [ClipPathProvider] which provides LiquidSwipe path.
 */
class LiquidSwipeClipPathProvider : ClipPathProvider() {
    /** Center of the wave */
    var waveCenterY: Float = 0f
    /** Initial horizontal radius of the wave */
    var initialHorizontalRadius = 0f
    /** Initial vertical radius of the wave */
    var initialVerticalRadius = 82f
    /** Initial revealed side width */
    var initialSideWidth = 0f

    private var waveHorizontalRadius: Float = 0f
    private var waveVerticalRadius: Float = 0f
    private var sideWidth: Float = 0f

    companion object Constants {
        private fun getMaxHorizontalRadius(view: View): Float {
            return view.width.toFloat() * 0.8f
        }

        private fun getMaxVerticalRadius(view: View): Float {
            return view.height.toFloat() * 0.9f
        }

        private fun getInitialWaveCenterY(view: View): Float {
            return view.height.toFloat() * 0.7167487685f
        }
    }

    override fun getPath(percent: Float, view: View): Path {
        waveCenterY = if (waveCenterY == 0f) view.height.toFloat() / 2 else waveCenterY
        waveHorizontalRadius = getWaveHorRadius(1 - (percent / 100), view)
        waveVerticalRadius = getWaveVertRadius(1 - (percent / 100), view)
        sideWidth = getSideWidth(1 - (percent / 100), view)

        path.reset()
        val maskWidth = view.width - sideWidth
        path.moveTo(maskWidth - sideWidth, 0f)
        path.lineTo(0f, 0f)
        path.lineTo(0f, view.height.toFloat())
        path.lineTo(maskWidth, view.height.toFloat())

        if (percent == 100f) {
            path.close()
            return path
        }

        val curveStartY = waveCenterY + waveVerticalRadius
        path.lineTo(maskWidth, curveStartY)

        path.cubicTo(
            maskWidth,
            (curveStartY - waveVerticalRadius * 0.1346194756).toFloat(),
            (maskWidth - waveHorizontalRadius * 0.05341339583).toFloat(),
            (curveStartY - waveVerticalRadius * 0.2412779634).toFloat(),
            (maskWidth - waveHorizontalRadius * 0.1561501458).toFloat(),
            (curveStartY - waveVerticalRadius * 0.3322374268).toFloat()
        )
        path.cubicTo(
            (maskWidth - waveHorizontalRadius * 0.2361659167).toFloat(),
            (curveStartY - waveVerticalRadius * 0.4030805244).toFloat(),
            (maskWidth - waveHorizontalRadius * 0.3305285625).toFloat(),
            (curveStartY - waveVerticalRadius * 0.4561193293).toFloat(),
            (maskWidth - waveHorizontalRadius * 0.5012484792).toFloat(),
            (curveStartY - waveVerticalRadius * 0.5350576951).toFloat()
        )
        path.cubicTo(
            (maskWidth - waveHorizontalRadius * 0.515878125).toFloat(),
            (curveStartY - waveVerticalRadius * 0.5418222317).toFloat(),
            (maskWidth - waveHorizontalRadius * 0.5664134792).toFloat(),
            (curveStartY - waveVerticalRadius * 0.5650349878).toFloat(),
            (maskWidth - waveHorizontalRadius * 0.574934875).toFloat(),
            (curveStartY - waveVerticalRadius * 0.5689655122).toFloat()
        )
        path.cubicTo(
            (maskWidth - waveHorizontalRadius * 0.7283715208).toFloat(),
            (curveStartY - waveVerticalRadius * 0.6397387195).toFloat(),
            (maskWidth - waveHorizontalRadius * 0.8086618958).toFloat(),
            (curveStartY - waveVerticalRadius * 0.6833456585).toFloat(),
            (maskWidth - waveHorizontalRadius * 0.8774032292).toFloat(),
            (curveStartY - waveVerticalRadius * 0.7399037439).toFloat()
        )
        path.cubicTo(
            (maskWidth - waveHorizontalRadius * 0.9653464583).toFloat(),
            (curveStartY - waveVerticalRadius * 0.8122605122).toFloat(),
            maskWidth - waveHorizontalRadius,
            (curveStartY - waveVerticalRadius * 0.8936183659).toFloat(),
            maskWidth - waveHorizontalRadius, curveStartY - waveVerticalRadius
        )
        path.cubicTo(
            maskWidth - waveHorizontalRadius,
            (curveStartY - waveVerticalRadius * 1.100142878).toFloat(),
            (maskWidth - waveHorizontalRadius * 0.9595746667).toFloat(),
            (curveStartY - waveVerticalRadius * 1.1887991951).toFloat(),
            (maskWidth - waveHorizontalRadius * 0.8608411667).toFloat(),
            (curveStartY - waveVerticalRadius * 1.270484439).toFloat()
        )
        path.cubicTo(
            (maskWidth - waveHorizontalRadius * 0.7852123333).toFloat(),
            (curveStartY - waveVerticalRadius * 1.3330544756).toFloat(),
            (maskWidth - waveHorizontalRadius * 0.703382125).toFloat(),
            (curveStartY - waveVerticalRadius * 1.3795848049).toFloat(),
            (maskWidth - waveHorizontalRadius * 0.5291125625).toFloat(),
            (curveStartY - waveVerticalRadius * 1.4665102805).toFloat()
        )
        path.cubicTo(
            (maskWidth - waveHorizontalRadius * 0.5241858333).toFloat(),
            (curveStartY - waveVerticalRadius * 1.4689677195).toFloat(),
            (maskWidth - waveHorizontalRadius * 0.505739125).toFloat(),
            (curveStartY - waveVerticalRadius * 1.4781625854).toFloat(),
            (maskWidth - waveHorizontalRadius * 0.5015305417).toFloat(),
            (curveStartY - waveVerticalRadius * 1.4802616098).toFloat()
        )
        path.cubicTo(
            (maskWidth - waveHorizontalRadius * 0.3187486042).toFloat(),
            (curveStartY - waveVerticalRadius * 1.5714239024).toFloat(),
            (maskWidth - waveHorizontalRadius * 0.2332057083).toFloat(),
            (curveStartY - waveVerticalRadius * 1.6204116463).toFloat(),
            (maskWidth - waveHorizontalRadius * 0.1541165417).toFloat(),
            (curveStartY - waveVerticalRadius * 1.687403).toFloat()
        )
        path.cubicTo(
            (maskWidth - waveHorizontalRadius * 0.0509933125).toFloat(),
            (curveStartY - waveVerticalRadius * 1.774752061).toFloat(),
            maskWidth, (curveStartY - waveVerticalRadius * 1.8709256829).toFloat(),
            maskWidth, curveStartY - waveVerticalRadius * 2
        )

        path.lineTo(maskWidth, 0f)
        path.close()
        return path
    }

    private fun getWaveHorRadius(percent: Float, view: View): Float {
        if (percent <= 0) {
            return initialHorizontalRadius
        }
        if (percent >= 1) {
            return 0f
        }
        val p1: Float = 0.4f
        if (percent <= p1) {
            return initialHorizontalRadius + percent / p1 * (getMaxHorizontalRadius(view) - initialHorizontalRadius)
        }
        val t: Float = ((percent - p1) / (1.0 - p1)).toFloat()
        val A: Float = getMaxHorizontalRadius(view)
        val r: Float = 40f
        val m: Float = 9.8f
        val beta: Float = r / (2 * m)
        val k: Float = 50f
        val omega0: Float = k / m
        val omega: Float = (-beta.pow(2) + omega0.pow(2)).pow(0.5f)

        return A * exp(-beta * t) * cos(omega * t)
    }

    private fun getWaveHorRadiusBack(percent: Float, view: View): Float {
        if (percent <= 0) {
            return initialHorizontalRadius
        }
        if (percent >= 1) {
            return 0f
        }
        val p1: Float = 0.4f
        if (percent <= p1) {
            return initialHorizontalRadius + percent / p1 * initialHorizontalRadius
        }
        val t: Float = ((percent - p1) / (1.0 - p1)).toFloat()
        val A: Float = 2 * initialHorizontalRadius
        val r: Float = 40f
        val m: Float = 9.8f
        val beta: Float = r / (2 * m)
        val k: Float = 50f
        val omega0: Float = k / m
        val omega: Float = (-beta.pow(2) + omega0.pow(2)).pow(0.5f)

        return A * exp(-beta * t) * cos(omega * t)
    }

    private fun getWaveVertRadius(percent: Float, view: View): Float {
        val p1: Float = 0.4f
        if (percent <= 0) {
            return initialVerticalRadius
        }
        if (percent >= p1) {
            return getMaxVerticalRadius(view)
        }
        return initialVerticalRadius + (getMaxVerticalRadius(view) - initialVerticalRadius) * percent / p1
    }

    private fun getSideWidth(percent: Float, view: View): Float {
        val p1: Float = 0.2f
        val p2: Float = 0.8f
        if (percent <= p1) {
            return initialSideWidth
        }
        if (percent >= p2) {
            return view.width.toFloat()
        }
        return initialSideWidth + (view.width - initialSideWidth) * ((percent - p1) / (p2 - p1))
    }
}