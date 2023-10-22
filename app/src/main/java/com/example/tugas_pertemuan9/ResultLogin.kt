package com.example.tugas_pertemuan9

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import com.example.tugas_pertemuan9.databinding.ActivityResultLoginBinding

class ResultLogin : AppCompatActivity() {

    private lateinit var binding: ActivityResultLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(SignInFragment.EXTRA_USERNAME)
        binding.txtUsn.text = "$username!"

        binding.back.setOnClickListener {
            val intent = Intent(this@ResultLogin, SignInFragment::class.java)
            startActivity(intent)
            finish()
        }
    }
}
