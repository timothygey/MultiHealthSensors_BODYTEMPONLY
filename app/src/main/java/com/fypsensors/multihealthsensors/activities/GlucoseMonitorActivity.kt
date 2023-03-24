package com.fypsensors.multihealthsensors.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fypsensors.multihealthsensors.databinding.ActivityGlucoseMonitorBinding

class GlucoseMonitorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGlucoseMonitorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGlucoseMonitorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeIv.setOnClickListener {
            onBackPressed()
        }
    }
}