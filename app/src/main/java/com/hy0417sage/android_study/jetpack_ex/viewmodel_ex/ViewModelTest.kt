package com.hy0417sage.android_study.jetpack_ex.viewmodel_ex

import android.util.Log
import androidx.lifecycle.ViewModel

class ViewModelTest : ViewModel() {

    private val TAG = "ViewModelTest"

    init{
        Log.d(TAG, "ViewModelTest init (생성)")
    }

    //ViewModel 은 LiveData 와 함께 사용
    private var countValue = 0
    fun plusValue() = countValue++
    fun minusValue() = countValue--

    fun getCount(): Int {
        Log.d(TAG, "ViewModelTest")
        return countValue
    }
}