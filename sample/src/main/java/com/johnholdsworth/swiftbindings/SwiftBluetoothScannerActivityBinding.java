package com.johnholdsworth.swiftbindings;

/**
 * Created by jmarkstar on 3/22/18.
 */

public interface SwiftBluetoothScannerActivityBinding {
    // Messages from Java Activity to Swift
    interface Listener extends SwiftMainActivityBinding.Listener {
    }

    // Messages from Swift back to Java Activity
    interface Responder extends SwiftMainActivityBinding.Responder {
        Object getLayoutInflater();
        void setAdapter(Object adapter);
    }
}
