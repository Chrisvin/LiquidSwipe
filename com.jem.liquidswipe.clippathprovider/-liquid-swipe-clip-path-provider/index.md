[liquidswipe](../../index.md) / [com.jem.liquidswipe.clippathprovider](../index.md) / [LiquidSwipeClipPathProvider](./index.md)

# LiquidSwipeClipPathProvider

`class LiquidSwipeClipPathProvider : `[`ClipPathProvider`](../../com.jem.liquidswipe.base/-clip-path-provider/index.md)

[ClipPathProvider](../../com.jem.liquidswipe.base/-clip-path-provider/index.md) which provides LiquidSwipe path.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `LiquidSwipeClipPathProvider()`<br>[ClipPathProvider](../../com.jem.liquidswipe.base/-clip-path-provider/index.md) which provides LiquidSwipe path. |

### Properties

| Name | Summary |
|---|---|
| [initialHorizontalRadius](initial-horizontal-radius.md) | `var initialHorizontalRadius: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Initial horizontal radius of the wave |
| [initialSideWidth](initial-side-width.md) | `var initialSideWidth: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Initial revealed side width |
| [initialVerticalRadius](initial-vertical-radius.md) | `var initialVerticalRadius: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Initial vertical radius of the wave |
| [waveCenterY](wave-center-y.md) | `var waveCenterY: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Center of the wave |

### Inherited Properties

| Name | Summary |
|---|---|
| [op](../../com.jem.liquidswipe.base/-clip-path-provider/op.md) | `var op: Op`<br>Region.Op variable that is used in [android.graphics.Canvas.clipPath](#) in the EasyRevealLayouts |
| [path](../../com.jem.liquidswipe.base/-clip-path-provider/path.md) | `var path: Path`<br>Path variable that should be used to make the path to be returned in [getPath](../../com.jem.liquidswipe.base/-clip-path-provider/get-path.md) function. |

### Functions

| Name | Summary |
|---|---|
| [getPath](get-path.md) | `fun getPath(percent: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, view: View): Path`<br>Generate the [Path](#) for the **percent** value to be applied in the **view**. |
