package com.example.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.backstack.databinding.ActivityCBinding
import com.example.backstack.databinding.ActivityMainBinding

class ActivityC : AppCompatActivity() {
    lateinit var binding: ActivityCBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnGoToD.setOnClickListener {
            val intent=Intent(this@ActivityC, ActivityD::class.java)

            //finish()//back stacktan bu sayfayı silecek d den geri basımca b ye geçer
            startActivity(intent)
        }
    }
}