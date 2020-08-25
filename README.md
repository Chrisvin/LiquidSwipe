# LiquidSwipe
 Android LiquidSwipe Library

 [![License: MIT](https://img.shields.io/badge/License-MIT-silver.svg)](https://opensource.org/licenses/MIT) [![](https://jitpack.io/v/Chrisvin/LiquidSwipe.svg)](https://jitpack.io/#Chrisvin/LiquidSwipe) [![API](https://img.shields.io/badge/API-21%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=21) 

| <img src="./demo%20screenshots/LiquidSwipeDemo.gif"/> | <img src="./demo%20screenshots/LiquidSwipeDemo_Touch_Interactive.gif"/> |
| :-: | :-: |
| [Default](#usage) | [Touch Interactive](#touch-interactive---making-the-liquidswipe-wave-center-y-value-match-the-touch-y-value) |

LiquidSwipe is a viewpager library that can be used to make awesome onboarding designs. ([Default Demo apk](https://github.com/Chrisvin/LiquidSwipe/releases/download/1.1/LiquidSwipeDemo.-.Default.apk)) ([TouchInteractive Demo apk](https://github.com/Chrisvin/LiquidSwipe/releases/download/1.1/LiquidSwipeDemo.-.Touch_Interactive.apk))

If you like this, you'll like [ConcentricOnboarding](https://github.com/Chrisvin/ConcentricOnboarding) as well.

## Demo app
To run the demo project, clone the repository and run it via Android Studio.
</br>(OR)
</br>Download the latest demo apk from [releases](https://github.com/Chrisvin/LiquidSwipe/releases).

## Usage
#### Set up the dependency
1. Add the JitPack repository to your root build.gradle at the end of repositories:
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
2. Add the LiquidSwipe dependency in the build.gradle:
```
implementation 'com.github.Chrisvin:LiquidSwipe:1.3'
```

#### Use `LiquidSwipeViewPager` instead of the normal `ViewPager`
```
<androidx.constraintlayout.widget.ConstraintLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <com.jem.liquidswipe.LiquidSwipeViewPager
        android:id="@+id/viewpager"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

</androidx.constraintlayout.widget.ConstraintLayout>
```

#### Use a `LiquidSwipeLayout` as the base container in the fragment layouts
```
<?xml version="1.0" encoding="utf-8"?>
<com.jem.liquidswipe.layout.LiquidSwipeConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".DummyFragment">

    <!--  Fill with your views, just like you would in a normal ConstraintLayout  -->

</com.jem.liquidswipe.layout.LiquidSwipeConstraintLayout>

<!--  Also supports LiquidSwipeFrameLayout & LiquidSwipeLinearLayout  -->
```
Note : [Dokka generated documentation on LiquidSwipeLayouts](https://chrisvin.github.io/LiquidSwipe/com.jem.liquidswipe.layout/)

### And you're done, easy-peasy. ^_^

## Touch Interactive - Making the LiquidSwipe wave center Y value match the touch Y value

Rather than having the wave center Y value always be layout.height/2 , it would be more aesthetically pleasing for it to be the same as the touch Y value. 
The following code can be used to dynamically change the `waveCenterY` based on the touch position on the `LiquidSwipeViewPager`.
(The reason this isn't done internally in the library is because the viewpager layouts don't get the touch events when said touch events are consumed directly by the viewpager)

1. In the `Activity`/`Fragment` class containing the `LiquidSwipeViewPager`
```kotlin
// Create an array of LiquidSwipeCPP, one for each layout in the PagerAdapter
val liquidSwipeClipPathProviders = Array(titleArray.count()) {
    LiquidSwipeClipPathProvider()
}

// Pass the LiquidSwipeCPP array to the adapter
viewpager.adapter = CustomPagerAdapter(this, liquidSwipeClipPathProviders)
// Similar logic can also be applied for your custom FragmentPagerAdapter/FragmentStatePagerAdapter

// Listen to onTouch events on the viewpager and update the waveCenterY value of the LiquidSwipeCPPs
viewpager.setOnTouchListener { _, event ->
    val waveCenterY = event.y
    liquidSwipeClipPathProviders.map {
        it.waveCenterY = waveCenterY
    }
    false
}
```
2. In the `PagerAdapter`
```kotlin
// Set the layout's clipPathProvider to the corresponding `LiquidSwipeClipPathProvider`
(layout as? LiquidSwipeLayout)?.clipPathProvider = liquidSwipeClipPathProviders[position]
```

The above code has been showcased in the demo app, feel free to look at it for reference.

**Note**: 
This is not a perfect solution, in fact some artifacts might occur due to the quick waveCenterY value jumps. 
But for now, this is the cleanest solution I can think of.
Anyone else with a better solution is welcome to fork and submit a pull request. :)

<img src="./demo%20screenshots/LiquidSwipeDemo_Touch_Interactive.gif"/>

## Creating custom swipe animations

The concept for the `ClipPathProvider` in LiquidSwipe is the same as that in the [EasyReveal library](https://github.com/Chrisvin/EasyReveal) (If you haven't already, then you should really check it out, infact the first version of LiquidSwipe used [EasyReveal](https://github.com/Chrisvin/EasyReveal) as a dependency).

You can create your own swipe animation by extending the [ClipPathProvider](https://github.com/Chrisvin/LiquidSwipe/blob/master/liquidswipe/src/main/java/com/jem/liquidswipe/base/ClipPathProvider.kt) and implementing the `getPath()` method. `getPath()` provides the [Path](https://developer.android.com/reference/android/graphics/Path) for a given *percent* value on the provided *view*.  The path gotten from `getPath()` is then used to clip the view using `canvas.clipPath(path, op)` (The `op` value is provided by the `ClipPathProvider` as well). You can then set your custom [ClipPathProvider](https://github.com/Chrisvin/LiquidSwipe/blob/master/liquidswipe/src/main/java/com/jem/liquidswipe/base/ClipPathProvider.kt) to your layouts.

## API Documentation

Documentation generated using Dokka : [chrisvin.github.io/LiquidSwipe](https://chrisvin.github.io/LiquidSwipe/)

## Bugs and Feedback
For bugs, questions and discussions please use the [Github Issues](https://github.com/Chrisvin/LiquidSwipe/issues).

## Credits
1. [Cuberto's liquid-swipe for iOS](https://github.com/Cuberto/liquid-swipe) - Source of inspiration
2. [Alvaro Fabre](https://lottiefiles.com/tomfabre) - Designer of the lottie animations in the demo app

## License
```
MIT License

Copyright (c) 2019 Jem

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
