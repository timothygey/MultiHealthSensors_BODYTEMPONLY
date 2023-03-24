package com.fypsensors.multihealthsensors.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fypsensors.multihealthsensors.databinding.ActivityGlucoseMonitorBinding
import com.fypsensors.multihealthsensors.databinding.ActivityUpdateMedicalRecordBinding

class UpdateMedicalRecordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUpdateMedicalRecordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUpdateMedicalRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeIv.setOnClickListener {
            onBackPressed()
        }
    }
}