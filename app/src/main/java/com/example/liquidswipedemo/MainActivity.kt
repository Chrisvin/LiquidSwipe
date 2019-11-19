package com.example.liquidswipedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jem.liquidswipe.clippathprovider.LiquidSwipeClipPathProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager.adapter = CustomFragmentPagerAdapter(supportFragmentManager)

        /*
        // The following code can be used to dynamically change the waveCenterY
        // based on the touch position (on the LiquidSwipeViewPager).

        // The reason this isn't done internally is because,
        // sometimes the viewpager layouts don't get the touch events
        // when said touch events are consumed directly by the viewpager.

        // Create an array of LiquidSwipeCPP, one for each layout in the PagerAdapter
        val liquidSwipeClipPathProviders = Array(titleArray.count()) {
            LiquidSwipeClipPathProvider()
        }

        // Similar logic can also be applied for your custom FragmentPagerAdapter/FragmentStatePagerAdapter
        viewpager.adapter = CustomPagerAdapter(this, liquidSwipeClipPathProviders)

        // Listen to onTouch events on the viewpager and update the waveCenterY value of the LiquidSwipeCPPs
        viewpager.setOnTouchListener { _, event ->
            val waveCenterY = event.y
            liquidSwipeClipPathProviders.map {
                it.waveCenterY = waveCenterY
            }
            false
        }
        */

        // Note that this is not a perfect solution,
        // in fact some artifacts might occur due to the quick waveCenterY value jumps.
        // But for now, this is the cleanest solution I can think of.
        // Anyone else with a better solution is welcome to fork and submit a pull request. :)

        // Create 20 times the number of actual pages, and start in the middle.
        // This way users can swipe left or right from the start.
        // Definitely not a good idea for production, but good enough for a demo app.
        viewpager.setCurrentItem(titleArray.count() * 10, false)
    }
}
