[liquidswipe](../../index.md) / [com.jem.liquidswipe.layout](../index.md) / [LiquidSwipeLinearLayout](./index.md)

# LiquidSwipeLinearLayout

`open class LiquidSwipeLinearLayout : LinearLayout, `[`LiquidSwipeLayout`](../../com.jem.liquidswipe.base/-liquid-swipe-layout/index.md)

`LiquidSwipeLinearLayout` is a custom [LinearLayout](#) that implements [LiquidSwipeLayout](../../com.jem.liquidswipe.base/-liquid-swipe-layout/index.md).

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `LiquidSwipeLinearLayout(context: Context?)`<br>`LiquidSwipeLinearLayout(context: Context?, attrs: AttributeSet?)`<br>`LiquidSwipeLinearLayout(context: Context?, attrs: AttributeSet?, defStyleAttr: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`LiquidSwipeLinearLayout(context: Context?, attrs: AttributeSet?, defStyleAttr: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, defStyleRes: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [clipPathProvider](clip-path-provider.md) | `open var clipPathProvider: `[`ClipPathProvider`](../../com.jem.liquidswipe.base/-clip-path-provider/index.md)<br>ClipPathProvider provides the path used for clipping. |
| [currentRevealPercent](current-reveal-percent.md) | `open var currentRevealPercent: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Percentage of the view currently revealed. |

### Functions

| Name | Summary |
|---|---|
| [draw](draw.md) | `open fun draw(canvas: Canvas?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Overriden from View |
| [revealForPercentage](reveal-for-percentage.md) | `open fun revealForPercentage(percent: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Update view to specified reveal percentage. |
