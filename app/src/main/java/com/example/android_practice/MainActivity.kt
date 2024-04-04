package com.example.android_practice

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.android_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tSatisfaction.text = getString(R.string.push_button)

        binding.bPushMe.setOnClickListener {                                            //по нажатию на кнопку меняется надпись, размер текста и появляется картинка!
            binding.tSatisfaction.text = getString(R.string.satisfaction)
            binding.tSatisfaction.textSize = 55F
            binding.imBonus.visibility = View.VISIBLE
        }
    }

}