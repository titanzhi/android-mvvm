package com.s3d.myviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.s3d.myviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.incrementButton.setOnClickListener {
            counter++
            binding.counter.text = counter.toString()
        }
    }
}