package com.tuan88291.androidkeynote

import android.content.Context

abstract class mAbtr(private val context: Context) {


    abstract val t: String

    fun setTextD(s: tst) {
        s.showText(context.resources.getString(R.string.app_name) + " " + t) //////run 2

        s.error("eror")///run 5
    }

}

 interface tst {
    fun showText(tex: String)
    fun error(mess: String)
}
