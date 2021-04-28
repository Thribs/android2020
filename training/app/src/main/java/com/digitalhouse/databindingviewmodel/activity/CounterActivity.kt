    package com.digitalhouse.databindingviewmodel.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.digitalhouse.databindingviewmodel.R
import com.digitalhouse.databindingviewmodel.databinding.ActivityCounterBinding
import com.digitalhouse.databindingviewmodel.viewmodel.CounterViewModel

class CounterActivity : AppCompatActivity() {
    private val viewmodel: CounterViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding: ActivityCounterBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_counter
        )
        binding.viewmodel = viewmodel
        binding.lifecycleOwner = this
    }
}