package com.hy0417sage.android_study.jetpack_ex.databinding_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hy0417sage.android_study.R
import com.hy0417sage.android_study.databinding.ActivityDatabindingTestBinding

class DataBindingTestActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDatabindingTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_databinding_test)

        binding.dataBindingTest.text = "바뀐 텍스트"

    }
}