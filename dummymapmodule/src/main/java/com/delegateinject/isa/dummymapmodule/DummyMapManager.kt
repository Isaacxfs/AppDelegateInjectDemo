package com.delegateinject.isa.dummymapmodule

import android.content.Context
import android.view.View
import android.widget.Toast

import com.delegateinject.isa.subfeature.MapManagerInterface

/**
 * @author fangsxu
 */
class DummyMapManager(private val context: Context) : MapManagerInterface {

    override fun onClick(v: View) {
        Toast.makeText(context, context.getString(R.string.haha), Toast.LENGTH_SHORT).show()
    }
}
