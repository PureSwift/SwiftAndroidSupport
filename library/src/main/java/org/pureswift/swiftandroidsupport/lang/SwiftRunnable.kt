package org.pureswift.swiftandroidsupport.lang

import android.util.Log

class SwiftRunnable(internal val __swiftObject: Long): Runnable {

    override fun run() {
        __run(__swiftObject)
    }

    fun finalize() {
        __finalize(__swiftObject)
    }

    private external fun __run(__swiftObject: Long)
    private external fun __finalize(__swiftObject: Long)
}