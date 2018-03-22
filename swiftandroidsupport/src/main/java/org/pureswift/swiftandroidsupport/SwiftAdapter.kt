package org.pureswift.swiftandroidsupport

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

/**
 * Created by coleman on 3/18/18.
 * Modified by jmarkstar on 3/22/18
 */
open class SwiftAdapter(private val __swiftObject: Long) : BaseAdapter() {

    external fun __finalize(__swiftObject: Long)

    private external fun __getCount(__swiftObject: Long): Int

    override fun getCount(): Int {
        return __getCount(__swiftObject)
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    private external fun __getView(__swiftObject: Long, position: Int, convertView: View?, parent: ViewGroup): View

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return __getView(__swiftObject, position, convertView, parent)
    }

    fun finalize() {
        __finalize(__swiftObject)
    }
}