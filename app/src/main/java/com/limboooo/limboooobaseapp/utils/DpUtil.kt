package com.limboooo.limboooobaseapp.utils

import android.content.Context
import com.limboooo.limboooobaseapp.MyApplication

object DpUtil {

    fun dip2px(context: Context = MyApplication.context, dpValue: Float): Int {
        val scale: Float = context.resources.displayMetrics.density
        return (dpValue * scale + 0.5f).toInt()
    }

    fun px2dip(context: Context = MyApplication.context, pxValue: Float): Int {
        val scale = context.resources.displayMetrics.density
        return (pxValue / scale + 0.5f).toInt()
    }
}