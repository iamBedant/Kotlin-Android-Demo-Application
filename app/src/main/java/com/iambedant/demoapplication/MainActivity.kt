package com.iambedant.demoapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    internal var mButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mButton = findViewById(R.id.btn_click) as Button?

        mButton!!.setOnClickListener { this.showMessage("Hello World") }
    }

    fun showMessage(string: String) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show()
    }
}
