package com.zhangrenwen.activitybesttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvCenter.setOnClickListener {
            SecondActivity.actionStart(this,"数据一","数据二")
        }
    }
}