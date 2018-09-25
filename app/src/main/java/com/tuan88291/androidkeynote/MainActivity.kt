package com.tuan88291.androidkeynote

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mp: mPre? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mp = mPre(this) ///run 1

        mp?.setTextD(object : tst {
            override fun showText(tex: String) {
                name.text = tex///run 4
            }

            override fun error(mess: String) {
                textView.text = mess///run 6
            }

        })




    }
}
