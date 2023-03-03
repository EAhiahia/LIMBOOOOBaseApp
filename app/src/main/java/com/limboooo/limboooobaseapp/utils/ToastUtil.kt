package com.limboooo.limboooobaseapp.utils

import android.widget.Toast
import com.limboooo.limboooobaseapp.MyApplication

fun String.showShortToast() {
    Toast.makeText(MyApplication.context, this, Toast.LENGTH_SHORT).show()
}

fun String.showLongToast() {
    Toast.makeText(MyApplication.context, this, Toast.LENGTH_LONG).show()
}