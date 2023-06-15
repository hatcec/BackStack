package com.example.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.backstack.databinding.ActivityDBinding
import com.example.backstack.databinding.ActivityMainBinding

class ActivityD : AppCompatActivity() {
    lateinit var binding: ActivityDBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onBackPressed() {//d ve c destroy olacak b ye gelecek ve backstepleri silip a ya geçecek
        val intent=Intent(this@ActivityD, ActivityB::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)

    }
}