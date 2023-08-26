package com.example.application830

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.application830.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.MaingotoMap.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }
        binding.MaingotoQna.setOnClickListener {
            val intent = Intent(this, QnaActivity::class.java)
            startActivity(intent)
        }
        binding.MaingotoCommunity.setOnClickListener {
            val intent = Intent(this, CommunityActivity::class.java)
            startActivity(intent)
        }
    }
}