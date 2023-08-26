package com.example.application830

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.application830.databinding.ActivityCommunityBinding

class CommunityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityCommunityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.CommunitygotoMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}