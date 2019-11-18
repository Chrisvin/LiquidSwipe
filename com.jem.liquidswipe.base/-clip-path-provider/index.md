[liquidswipe](../../index.md) / [com.jem.liquidswipe.base](../index.md) / [ClipPathProvider](./index.md)

# ClipPathProvider

`abstract class ClipPathProvider`

Abstract class that should be extended by other ClipPathProvider classes.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ClipPathProvider()`<br>Abstract class that should be extended by other ClipPathProvider classes. |

### Properties

| Name | Summary |
|---|---|
| [op](op.md) | `var op: Op`<br>Region.Op variable that is used in [android.graphics.Canvas.clipPath](#) in the EasyRevealLayouts |
| [path](path.md) | `var path: Path`<br>Path variable that should be used to make the path to be returned in [getPath](get-path.md) function. |

### Functions

| Name | Summary |
|---|---|
| [getPath](get-path.md) | `abstract fun getPath(percent: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, view: View): Path`<br>Generate the [Path](#) for the **percent** value to be applied in the **view**. |

### Inheritors

| Name | Summary |
|---|---|
| [LiquidSwipeClipPathProvider](../../com.jem.liquidswipe.clippathprovider/-liquid-swipe-clip-path-provider/index.md) | `class LiquidSwipeClipPathProvider : `[`ClipPathProvider`](./index.md)<br>[ClipPathProvider](./index.md) which provides LiquidSwipe path. |
