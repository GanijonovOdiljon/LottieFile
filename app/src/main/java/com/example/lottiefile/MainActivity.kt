package com.example.lottiefile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lottiefile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button1.setOnClickListener {
            binding.lottieanime.playAnimation()
        }
        binding.button2.setOnClickListener {
            binding.lottieanime.pauseAnimation()
        }
        }
}
