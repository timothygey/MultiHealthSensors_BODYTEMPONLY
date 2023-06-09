package com.fypsensors.multihealthsensors.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fypsensors.multihealthsensors.databinding.ActivityBodyTemperatureBinding
import com.fypsensors.multihealthsensors.databinding.ActivityHeartRateBinding

class HeartRateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHeartRateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeartRateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeIv.setOnClickListener {
            onBackPressed()
        }
    }
}