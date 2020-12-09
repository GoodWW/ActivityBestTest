package com.zhangrenwen.activitybesttest

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 作者：张人文
 * 时间：2020/12/9 15:13
 * 邮箱：479696877@QQ.COM
 * 描述：
 */
class SecondActivity : BaseActivity() {

    companion object {
        fun actionStart(context: Context, data1: String, data2: String) {
            //普通函数  的实现
//            val intent = Intent(context, SecondActivity::class.java)
//            intent.putExtra("param1", data1)
//            intent.putExtra("param2", data2)

            //标准函数 apply 的实现
            val intent = Intent(context, SecondActivity::class.java).apply {
                putExtra("param1", data1)
                putExtra("param2", data2)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvCenter.text = "第二个Activity"

        tvCenter.setOnClickListener {
            ActivityCollector.finishAll()
        }

        Log.d(
            "TAG", "onCreate: " + intent.getStringExtra("param1")
                    + "\n" + intent.getStringExtra("param2")
        )
    }
}