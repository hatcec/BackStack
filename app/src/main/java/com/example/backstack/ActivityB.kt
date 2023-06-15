package com.example.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.backstack.databinding.ActivityBBinding
import com.example.backstack.databinding.ActivityMainBinding

class ActivityB : AppCompatActivity() {
    lateinit var binding: ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnGoToC.setOnClickListener {
            startActivity(Intent(this@ActivityB,ActivityC::class.java))
        }
    }
}