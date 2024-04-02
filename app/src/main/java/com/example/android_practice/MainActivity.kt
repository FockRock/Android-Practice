package com.example.android_practice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.android_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.bPushMe.setOnClickListener {                                            //по нажатию на кнопку меняется надпись и размер текста
            bindingClass.tSatisfaction.text = getString(R.string.satisfaction)
            bindingClass.tSatisfaction.textSize = 65F
        }
    }

}