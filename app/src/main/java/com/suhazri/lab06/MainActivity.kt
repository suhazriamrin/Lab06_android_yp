package com.suhazri.lab06

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.suhazri.lab06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.courses.setOnClickListener {
            binding.infoTextView.text = "Android ATC 801 cconsists of topics ranging from UI Creation, App Development and Firebase"
        }

        binding.Exams.setOnClickListener {
            binding.infoTextView.text = "Exam consists of 45 questions in 90 minutes with passing mark of 70%"
        }

        binding.Freelance.setOnClickListener {
            binding.infoTextView.text = "You can be an Android Engineer upon completion on the course"
        }

    }
}