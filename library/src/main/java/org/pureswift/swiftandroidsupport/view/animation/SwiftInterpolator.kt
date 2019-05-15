package org.pureswift.swiftandroidsupport.view.animation

import android.view.animation.Interpolator

/**
 * An interpolator defines the rate of change of an animation.
 * This allows the basic animation effects (alpha, scale, translate, rotate) to be accelerated, decelerated, repeated, etc.
 * */
open class SwiftInterpolator(private val __swiftObject: Long): Interpolator {

    override fun getInterpolation(input: Float): Float {
        return __getInterpolation(__swiftObject, input)
    }

    private external fun __getInterpolation(__swiftObject: Long, input: Float): Float
}