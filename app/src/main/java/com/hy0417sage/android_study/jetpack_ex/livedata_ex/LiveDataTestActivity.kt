package com.hy0417sage.android_study.jetpack_ex.livedata_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.hy0417sage.android_study.R
import com.hy0417sage.android_study.databinding.ActivityLivedataTestBinding

class LiveDataTestActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLivedataTestBinding
    private var testMutableLiveData = MutableLiveData(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLivedataTestBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            testMutableLiveData.value = testMutableLiveData.value!!.plus(1)
        }

        //testMutableLiveData 가 바뀌는 것을 관찰 : testMutableLiveData 값이 변경될 때 마다 로그가 실행된다.
        testMutableLiveData.observe(this, Observer{
            Log.d("testMutableLiveData", testMutableLiveData.value.toString())
        })
    }
}