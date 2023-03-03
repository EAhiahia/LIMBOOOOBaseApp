package com.limboooo.limboooobaseapp.activity

import android.content.Context
import android.util.Log
import androidx.fragment.R
import androidx.lifecycle.ViewModel
import com.github.fragivity.NavOptions
import java.util.prefs.Preferences

//val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "data")

const val disableLog = false
fun String.showLog(tag: String = "myapp") {
    if (!disableLog) Log.d(tag, this)
}



fun NavOptions.initAnimator() {
    enterAnim = R.animator.fragment_open_enter
    exitAnim = R.animator.fragment_open_exit
    popEnterAnim = R.animator.fragment_close_enter
    popExitAnim = R.animator.fragment_close_exit
}

class MainViewModel:ViewModel() {
}