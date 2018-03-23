package org.pureswift.swiftandroidsupport.sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ListView
import com.johnholdsworth.swiftbindings.SwiftBluetoothScannerActivityBinding
import org.pureswift.swiftandroidsupport.SwiftAdapter

class MainActivity : AppCompatActivity(), SwiftBluetoothScannerActivityBinding.Responder {

    companion object {
        private fun loadNativeDependencies(){
            System.loadLibrary("swiftandroid")
        }
    }

    private var listener :SwiftBluetoothScannerActivityBinding.Listener? = null
    private var listView: ListView? = null

    private external fun bind(self: SwiftBluetoothScannerActivityBinding.Responder): SwiftBluetoothScannerActivityBinding.Listener


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadNativeDependencies()

        listener = bind(this)

        listView = findViewById(R.id.listView)

        // inform Swift
        listener!!.viewDidLoad()
    }

    override fun setAdapter(adapter: Any?) {
        val swiftAdapter = adapter as SwiftAdapter
        listView!!.adapter = swiftAdapter
    }

    /*
    override fun getLayoutInflater(): LayoutInflater? {
        return this.layoutInflater
    }*/
}
