[liquidswipe](../../index.md) / [com.jem.liquidswipe](../index.md) / [LiquidSwipeViewPager](./index.md)

# LiquidSwipeViewPager

`class LiquidSwipeViewPager : ViewPager`

`LiquidSwipeViewPager` is a custom [ViewPager](#) that uses a fixed scroller and uses a [LiquidSwipePageTransformer](-liquid-swipe-page-transformer/index.md) as it's page transformer.

Note: Setting another page transformer to [LiquidSwipeViewPager](./index.md) would remove the [LiquidSwipePageTransformer](-liquid-swipe-page-transformer/index.md).

### Types

| Name | Summary |
|---|---|
| [LiquidSwipePageTransformer](-liquid-swipe-page-transformer/index.md) | `class LiquidSwipePageTransformer : PageTransformer`<br>`LiquidSwipePageTransformer` is a custom [ViewPager.PageTransformer](#) that is used for LiquidSwipe reveal. |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `LiquidSwipeViewPager(context: Context)`<br>`LiquidSwipeViewPager(context: Context, attrs: AttributeSet?)` |

### Functions

| Name | Summary |
|---|---|
| [setDuration](set-duration.md) | `fun setDuration(duration: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the fixed scroller duration for the [LiquidSwipeViewPager](./index.md). |
