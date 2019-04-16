package com.delegateinject.isa.subfeature

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

/**
 * @author fangsxu
 */
class SubActivity : AppCompatActivity() {
    private var btn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        btn = findViewById(R.id.btn)

        btn!!.setOnClickListener(AppDelegate.manager)
    }
}
