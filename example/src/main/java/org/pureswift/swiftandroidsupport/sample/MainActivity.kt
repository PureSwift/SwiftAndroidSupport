package org.pureswift.swiftandroidsupport.sample

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.content.ContextCompat
import android.widget.ListView
import com.johnholdsworth.swiftbindings.SwiftBluetoothScannerActivityBinding
import org.pureswift.swiftandroidsupport.SwiftAdapter

class MainActivity : AppCompatActivity(), SwiftBluetoothScannerActivityBinding.Responder {

    companion object {

        val PERMISSION_REQUEST_CODE = 1000;

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

        askPermission()
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == PERMISSION_REQUEST_CODE && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            listener!!.viewDidLoad()
        }else{
            askPermission()
        }
    }

    private fun askPermission() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M &&
                ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED ){
            requestPermissions(arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION), PERMISSION_REQUEST_CODE)
        }else{
            listener!!.viewDidLoad()
        }
    }

    override fun setAdapter(adapter: Any?) {
        val swiftAdapter = adapter as SwiftAdapter
        listView!!.adapter = swiftAdapter
    }
}
