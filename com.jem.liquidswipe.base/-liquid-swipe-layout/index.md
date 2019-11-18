[liquidswipe](../../index.md) / [com.jem.liquidswipe.base](../index.md) / [LiquidSwipeLayout](./index.md)

# LiquidSwipeLayout

`interface LiquidSwipeLayout`

LiquidSwipeLayout is the base interface for all the other LiquidSwipeLayouts

### Properties

| Name | Summary |
|---|---|
| [clipPathProvider](clip-path-provider.md) | `abstract var clipPathProvider: `[`ClipPathProvider`](../-clip-path-provider/index.md)<br>ClipPathProvider provides the path used for clipping. |
| [currentRevealPercent](current-reveal-percent.md) | `abstract var currentRevealPercent: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Percentage of the view currently revealed. |

### Functions

| Name | Summary |
|---|---|
| [revealForPercentage](reveal-for-percentage.md) | `abstract fun revealForPercentage(percent: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Update view to specified reveal percentage. |

### Inheritors

| Name | Summary |
|---|---|
| [LiquidSwipeConstraintLayout](../../com.jem.liquidswipe.layout/-liquid-swipe-constraint-layout/index.md) | `open class LiquidSwipeConstraintLayout : ConstraintLayout, `[`LiquidSwipeLayout`](./index.md)<br>`LiquidSwipeConstraintLayout` is a custom [ConstraintLayout](#) that implements [LiquidSwipeLayout](./index.md). |
| [LiquidSwipeFrameLayout](../../com.jem.liquidswipe.layout/-liquid-swipe-frame-layout/index.md) | `open class LiquidSwipeFrameLayout : FrameLayout, `[`LiquidSwipeLayout`](./index.md)<br>`LiquidSwipeFrameLayout` is a custom [FrameLayout](#) that implements [LiquidSwipeLayout](./index.md). |
| [LiquidSwipeLinearLayout](../../com.jem.liquidswipe.layout/-liquid-swipe-linear-layout/index.md) | `open class LiquidSwipeLinearLayout : LinearLayout, `[`LiquidSwipeLayout`](./index.md)<br>`LiquidSwipeLinearLayout` is a custom [LinearLayout](#) that implements [LiquidSwipeLayout](./index.md). |
