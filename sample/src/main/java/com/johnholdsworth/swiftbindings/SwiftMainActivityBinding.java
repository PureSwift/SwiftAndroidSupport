package com.johnholdsworth.swiftbindings;

/**
 * Created by jmarkstar on 3/22/18.
 */

public interface SwiftMainActivityBinding {
    // Messages from Java Activity to Swift
    interface Listener {
        void viewDidLoad();
    }

    // Messages from Swift back to Java Activity
    interface Responder {
    }
}
