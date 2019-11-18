package com.jem.liquidswipe.base

import android.graphics.Path
import android.graphics.Region
import android.os.Build
import android.view.View

/** Abstract class that should be extended by other ClipPathProvider classes. */
abstract class ClipPathProvider {
    /** Path variable that should be used to make the path to be returned in [getPath] function.*/
    protected var path: Path = Path()
    /**
     * Region.Op variable that is used in [android.graphics.Canvas.clipPath] in the EasyRevealLayouts
     * @throws IllegalArgumentException Will be thrown if values other than [Region.Op.INTERSECT] and
     * [Region.Op.DIFFERENCE] are provided when API level is greater than or equal to [Build.VERSION_CODES.P].
     */
    var op: Region.Op = Region.Op.INTERSECT
        set(value) {
            require(!(Build.VERSION.SDK_INT >= Build.VERSION_CODES.P && op != Region.Op.INTERSECT && op != Region.Op.DIFFERENCE)) { "Invalid Region.Op - only INTERSECT and DIFFERENCE are allowed" }
            field = value
        }

    /**
     * Generate the [Path] for the **percent** value to be applied in the **view**.
     * @param percent Reveal percentage
     * @param view View on which to apply clipPath for reveal
     * @return **path** that can be used to clip the view.
     */
    abstract fun getPath(percent: Float, view: View): Path
}