package com.nowwon.kotlinbasic01_present

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.clickBtn
import kotlinx.android.synthetic.main.activity_main.smallBtn

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn
        smallBtn

    }
}