[liquidswipe](../../index.md) / [com.jem.liquidswipe.base](../index.md) / [ClipPathProvider](index.md) / [op](./op.md)

# op

`var op: Op`

Region.Op variable that is used in [android.graphics.Canvas.clipPath](#) in the EasyRevealLayouts

### Exceptions

`IllegalArgumentException` - Will be thrown if values other than [Region.Op.INTERSECT](#) and
[Region.Op.DIFFERENCE](#) are provided when API level is greater than or equal to [Build.VERSION_CODES.P](#).