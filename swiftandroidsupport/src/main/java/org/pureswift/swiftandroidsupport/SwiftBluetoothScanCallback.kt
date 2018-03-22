package org.pureswift.swiftandroidsupport

import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult

/**
 * Created by coleman on 3/17/18.
 * Modified by jmarkstar on 3/22/18
 */
@SuppressWarnings("JniMissingFunction")
class SwiftBluetoothScanCallback(private val __swiftObject: Long): ScanCallback() {

    external fun __onScanResult(swiftObject: Long, callbackType: Int, result: android.bluetooth.le.ScanResult?)

    override fun onScanResult(callbackType: Int, result: android.bluetooth.le.ScanResult?) {
        __onScanResult(__swiftObject, callbackType, result)
    }

    external fun __onBatchScanResults(swiftObject: Long, results: MutableList<ScanResult>?)

    override fun onBatchScanResults(results: MutableList<ScanResult>?) {
        __onBatchScanResults(__swiftObject, results)
    }

    external fun __onScanFailed(swiftObject: Long, errorCode: Int)

    override fun onScanFailed(errorCode: Int) {
        __onScanFailed(__swiftObject, errorCode)
    }

    external fun __finalize(__swiftObject: Long)

    fun finalize() {
        __finalize(__swiftObject)
    }
}