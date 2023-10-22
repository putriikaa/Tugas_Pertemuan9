package com.example.tugas_pertemuan9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas_pertemuan9.databinding.ActivityResultRegisterBinding

class ResultRegister : AppCompatActivity() {
    private lateinit var binding: ActivityResultRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstName = intent.getStringExtra(SignUpFragment.EXTRA_FIRST_NAME)
        val lastName = intent.getStringExtra(SignUpFragment.EXTRA_LAST_NAME)

        val welcomeMessage = "$firstName $lastName!"
        binding.textwelcomeusn.text = welcomeMessage

        binding.back.setOnClickListener {
            val intent = Intent(this@ResultRegister, SignUpFragment::class.java)
            startActivity(intent)
            finish()
        }
    }

}