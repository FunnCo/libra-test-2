package com.funnco.libratest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.funnco.toasty.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toaster.show("text", this)
    }
}